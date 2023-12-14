package StudentCurdOperations.service;

import StudentCurdOperations.config.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Praveenkumar on 12/14/2023.
 */
public class DeleteStudentRecord {

    public void deleteStudentBasedOnID(int id) throws SQLException {
        Connection connection = DatabaseConnection.getDataBaseConnection();
        String DELETE_USERS_SQL_NAME = "DELETE from testStudentDB where id = ? ;";
        PreparedStatement preparedStatement_Delete_Based_On_Id = connection.prepareStatement(DELETE_USERS_SQL_NAME);
        preparedStatement_Delete_Based_On_Id.setInt(1, id);
        System.out.println(preparedStatement_Delete_Based_On_Id);
        preparedStatement_Delete_Based_On_Id.execute();
    }
}
