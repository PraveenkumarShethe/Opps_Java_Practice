package StudentCurdOperations.service;

import StudentCurdOperations.config.DatabaseConnection;
import StudentCurdOperations.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Praveenkumar on 12/14/2023.
 */
public class AddNewStudent {

    public void saveStudent(Student student) throws SQLException {
        //save to database
        Connection connection = DatabaseConnection.getDataBaseConnection();

        String INSERT_USERS_SQL = "INSERT INTO testStudentDB" +
                "  (id, name, lastname, age) VALUES " +
                " (?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
        preparedStatement.setInt(1, student.getID());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setString(3, student.getLastName());
        preparedStatement.setInt(4, student.getAge());
        System.out.println(preparedStatement);
        preparedStatement.executeUpdate();
    }

}
