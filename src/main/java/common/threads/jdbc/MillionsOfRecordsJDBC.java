package common.threads.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class MillionsOfRecordsJDBC {

    public static void main(String[] args) throws SQLException {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement(
                     ResultSet.TYPE_FORWARD_ONLY, //Optimizes for streaming.
                     ResultSet.CONCUR_READ_ONLY); //Fetches rows in batches (avoids loading all rows into memory).
             ResultSet rs = stmt.executeQuery("SELECT * FROM large_table")) {

            stmt.setFetchSize(1000); // Fetch in batches (not all at once)

            while (rs.next()) {
                // Process one row at a time
                processRow(rs);
            }
        }
    }

    private void processManyRows1() throws SQLException {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "SELECT * FROM large_table",
                     ResultSet.TYPE_FORWARD_ONLY,
                     ResultSet.CONCUR_READ_ONLY)) {

            conn.setAutoCommit(false); // Required for cursors
            stmt.setFetchSize(1000); // Batch size

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    processRow(rs);
                }
            }
        }
    }

    private static void processManyRows2() throws SQLException, ExecutionException, InterruptedException {
        ForkJoinPool pool = new ForkJoinPool(4); // 4 threads
        List<Future<?>> futures = new ArrayList<>();

        try (PreparedStatement stmt = getConnection().prepareStatement(
                "SELECT * FROM large_table",
                ResultSet.TYPE_FORWARD_ONLY,
                ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery("SELECT * FROM large_table")) {
            while (rs.next()) {
                Map<String, Object> row = extractRow(rs); // Convert to Map/POJO
                futures.add(pool.submit(() -> processRow(row)));
            }
        }
        // Wait for completion
        for (Future<?> f : futures) f.get();
    }

    private static void batchProcessing() throws SQLException {
        try (PreparedStatement stmt = getConnection().prepareStatement(
                "SELECT * FROM large_table",
                ResultSet.TYPE_FORWARD_ONLY,
                ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery("SELECT * FROM large_table")) {
            PreparedStatement pstmt = null;
            int batchSize = 0;
            while (rs.next()) {
                Map<String, Object> row = extractRow(rs);
                pstmt.setObject(1, row.get("col1"));
                pstmt.addBatch(); // Add to batch

                if (++batchSize % 1000 == 0) {
                    pstmt.executeBatch(); // Flush every 1000 rows
                }
            }
            pstmt.executeBatch(); // Flush remaining
        }
    }

    private static void processRow(Map<String, Object> row) {

    }

    private static Map<String, Object> extractRow(ResultSet rs) {
        return null;
    }

    private static void processRow(ResultSet rs) {

    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:13306/blablajob", "blablauser", "blablapassword");
    }
}
