package StudentCurdOperations;

import StudentCurdOperations.service.StudentOperation;

import java.sql.SQLException;

/**
 * Created by Praveenkumar on 12/14/2023.
 */
public class StudentMain {

    public static void main(String[] args) throws SQLException {
        StudentOperation studentOperation = new StudentOperation();
        studentOperation.curd();
    }

}
