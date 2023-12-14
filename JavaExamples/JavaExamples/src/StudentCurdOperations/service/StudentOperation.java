package StudentCurdOperations.service;

import StudentCurdOperations.impl.StudentInterface;
import StudentCurdOperations.model.Student;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by Praveenkumar on 12/14/2023.
 *
 * Inheritance
 */
public class StudentOperation implements StudentInterface {
    public void curd() throws SQLException {
        while(true) {
            System.out.println(" Select your choices : ");
            System.out.println(" to crate press 1 , to update press 2, to retrive data press 3, to delete record based on ID press 4 and enter, PRESS 5 to exit " );
            Scanner scanner = new Scanner(System.in);
            int selectedChoice = scanner.nextInt();
            StudentOperation studentOperation = new StudentOperation();
            switch (selectedChoice) {
                case 1:
                    System.out.println("Create Student record :");
                    // Student create
                    Student student = new Student();
                    Scanner scannerStudentCreate = new Scanner(System.in);
                    System.out.println("Enter Name ");
                    student.setName(scannerStudentCreate.nextLine());
                    System.out.println("Enter Last Name ");
                    student.setLastName(scannerStudentCreate.nextLine());
                    System.out.println("Enter Id");
                    student.setID(scannerStudentCreate.nextInt());
                    System.out.println("Enter Age ");
                    student.setAge(scannerStudentCreate.nextInt());
                    studentOperation.addStudent(student);


                    break;

                case 2:
                    System.out.println("Update Student record :");
                    // Student create
                    Student studentUpodate = new Student();
                    Scanner scannerStudentUpdate = new Scanner(System.in);
                    System.out.println("Enter Name ");
                    studentUpodate.setName(scannerStudentUpdate.nextLine());
                    System.out.println("Enter Last Name ");
                    studentUpodate.setLastName(scannerStudentUpdate.nextLine());
                    System.out.println("Enter Id for which you want to update the record ");
                    studentUpodate.setID(scannerStudentUpdate.nextInt());
                    System.out.println("Enter Age ");
                    studentUpodate.setAge(scannerStudentUpdate.nextInt());
                    studentOperation.updateStudent(studentUpodate);
                    break;

                case 3:
                    System.out.println("Display all Students in the data base ");
                    studentOperation.showAllStudents();
                    break;
                case 4:
                    System.out.println("Delete the record form the student DB based on ID ");
                    Scanner scannerStudentDelete= new Scanner(System.in);
                    System.out.println("Enter record ID you to delete ");
                    int studentId = scannerStudentDelete.nextInt();
                    studentOperation.deleteStudentRecord(studentId);
                    break;
                case 5:
                    System.out.println("Exit the operations");
                    System.exit(0);
                    break;
            }
        }
    }

    public void deleteStudentRecord(int id) throws SQLException {
        // delete by id
        DeleteStudentRecord deleteStudentRecord = new DeleteStudentRecord();
        deleteStudentRecord.deleteStudentBasedOnID(id);

    }

    public void showAllStudents() throws SQLException {
        // show all
        RetriceStudentDataBase retriceStudentDataBase = new RetriceStudentDataBase();
        retriceStudentDataBase.showAllStudents();
    }

    public void updateStudent(Student student) throws SQLException {
        //update to DB based on ID
        UpdateStudentDetails updateStudentDetails = new UpdateStudentDetails();
        updateStudentDetails.updateStudent(student);
    }

    public boolean addStudent(Student student) throws SQLException {
        //add to DB
        AddNewStudent addNewStudent = new AddNewStudent();
        addNewStudent.saveStudent(student);
        return true;
    }
}
