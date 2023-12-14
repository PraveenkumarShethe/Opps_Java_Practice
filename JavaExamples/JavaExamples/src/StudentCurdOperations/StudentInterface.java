package StudentCurdOperations;

/**
 * Created by Praveenkumar on 12/14/2023.
 *
 *  Abstraction
 */
public interface StudentInterface {

    public void curd();

    void deleteStudentRecord(int id);

    void showAllStudents();

    void updateStudent(Student student);

    boolean addStudent(Student student)
}
