package common.threads;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
This approach avoids reading/updating all data at once → less memory use.
JDBC is used here for pure Java compatibility (no Spring required).
Use pagination or primary key ranges for batch partitioning.
Use connection pooling (e.g., HikariCP) in real production code.
 */

public class BulkDataProcessor {
    private static final int THREADS = 4;
    private static final int BATCH_SIZE = 3;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(THREADS);
        int totalRecords = getTotalRecordsCount();
        List<Future<?>> futures = new ArrayList<>();
        for (int offset = 0; offset < totalRecords; offset += BATCH_SIZE) {
            int finalOffset = offset;
            futures.add(executor.submit(() -> processBatch(finalOffset, BATCH_SIZE)));
        }
        for (Future<?> future : futures) {
            future.get();// wait for completion
        }
        executor.shutdown();
        System.out.println("Processing complete.");
    }

    private static Object processBatch(int finalOffset, int limit) {
        try (Connection conn = getConnection();
             PreparedStatement select = conn.prepareStatement(
                     "SELECT id, title FROM task ORDER BY id LIMIT ? OFFSET ?")) {

            select.setInt(1, limit);
            select.setInt(2, finalOffset);

            ResultSet rs = select.executeQuery();

            List<Integer> idsToUpdate = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                // process your data here...
                System.out.println("Task id: " + id + ", title: " + title);
                //idsToUpdate.add(id);
            }

            try (PreparedStatement update = conn.prepareStatement(
                    "UPDATE your_table SET processed = 1 WHERE id = ?")) {
                for (int id : idsToUpdate) {
                    update.setInt(1, id);
                    update.addBatch();
                }
                update.executeBatch();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    private static int getTotalRecordsCount() {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(*) FROM task");
             ResultSet rs = stmt.executeQuery()) {
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to count rows", e);
        }
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:13306/blablajob", "blablauser", "blablapassword");
    }
}
