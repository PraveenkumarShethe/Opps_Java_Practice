package StudentCurdOperations.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Praveenkumar on 12/14/2023.
 */
public class DatabaseConnection {

    private DatabaseConnection() {
    }

    public static Connection getDataBaseConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "password");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Opened database successfully");
        return connection;
    }

}
