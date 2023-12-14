package StudentCurdOperations.impl;

import StudentCurdOperations.model.Student;

import java.sql.SQLException;

/**
 * Created by Praveenkumar on 12/14/2023.
 *
 *  Abstraction
 */
public interface StudentInterface {

    public void curd() throws SQLException;

    void deleteStudentRecord(int id);

    void showAllStudents();

    void updateStudent(Student student) throws SQLException;

    boolean addStudent(Student student) throws SQLException;
}
