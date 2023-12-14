package StudentCurdOperations.service;

import StudentCurdOperations.config.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Praveenkumar on 12/14/2023.
 */
public class RetriceStudentDataBase {


    public void showAllStudents() throws SQLException {
        Connection connection = DatabaseConnection.getDataBaseConnection();

        String RETRIEVE_STUDENT = "SELECT * FROM testStudentDB; ";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(RETRIEVE_STUDENT);

        System.out.println( "ID" + "\t" + "Name " + "\t" + "Last Name " + "\t" + "Age"  );
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("name") +  "\t" + resultSet.getString("lastname") +  "\t" +  resultSet.getInt("age"));
            System.out.println();
        }

        resultSet.close();
        statement.close();
        connection.close();
        System.out.println(" Data Retrieved Successfully ..");
    }
}
