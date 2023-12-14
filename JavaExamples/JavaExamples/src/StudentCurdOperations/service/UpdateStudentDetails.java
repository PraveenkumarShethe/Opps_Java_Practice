package StudentCurdOperations.service;

import StudentCurdOperations.config.DatabaseConnection;
import StudentCurdOperations.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Praveenkumar on 12/14/2023.
 */
public class UpdateStudentDetails {

    public void updateStudent(Student student) throws SQLException {
        Connection connection = DatabaseConnection.getDataBaseConnection();

        String UPDATE_USERS_SQL_NAME = "Update testStudentDB set name = ? where id = ? ;";
        PreparedStatement preparedStatement_name = connection.prepareStatement(UPDATE_USERS_SQL_NAME);
        preparedStatement_name.setString(1, student.getName());
        preparedStatement_name.setInt(2, student.getID());
        System.out.println(" Name correction "+preparedStatement_name);
        preparedStatement_name.executeUpdate();

        String UPDATE_USERS_SQL_LASTNAME = "Update testStudentDB set lastname = ? where id = ? ;";
        PreparedStatement preparedStatement_lastname = connection.prepareStatement(UPDATE_USERS_SQL_LASTNAME);
        preparedStatement_lastname.setString(1, student.getLastName());
        preparedStatement_lastname.setInt(2, student.getID());
        System.out.println(" LastName correction "+preparedStatement_lastname);
        preparedStatement_lastname.executeUpdate();

        String UPDATE_USERS_SQL_AGE = "Update testStudentDB set age = ? where id = ? ;";
        PreparedStatement preparedStatement_AGE = connection.prepareStatement(UPDATE_USERS_SQL_AGE);
        preparedStatement_AGE.setInt(1, student.getAge());
        preparedStatement_AGE.setInt(2, student.getID());
        System.out.println(" Age correction "+preparedStatement_AGE);
        preparedStatement_AGE.executeUpdate();
        System.out.println(" Update to database for ID  " + student.getID());
    }

}
