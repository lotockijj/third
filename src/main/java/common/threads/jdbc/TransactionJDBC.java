package common.threads.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static common.threads.jdbc.MillionsOfRecordsJDBC.getConnection;

public class TransactionJDBC {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            // 1. Get connection (disable auto-commit)
            conn = getConnection();
            conn.setAutoCommit(false); // This starts the transaction

            // 2. Execute SQL operations
            try (PreparedStatement stmt1 = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?")) {
                stmt1.setBigDecimal(1, new BigDecimal("100.00"));
                stmt1.setInt(2, 123);
                stmt1.executeUpdate();
            }

            try (PreparedStatement stmt2 = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {
                stmt2.setBigDecimal(1, new BigDecimal("100.00"));
                stmt2.setInt(2, 456);
                stmt2.executeUpdate();
            }

            // 3. Commit if everything succeeds
            conn.commit();

        } catch (SQLException e) {
            // 4. Rollback on failure
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace(); // Log rollback failure
                }
            }
            throw new RuntimeException("Transaction failed", e);
        } finally {
            // 5. Restore auto-commit and close connection
            if (conn != null) {
                try {
                    conn.setAutoCommit(true); // Reset for connection pool
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
