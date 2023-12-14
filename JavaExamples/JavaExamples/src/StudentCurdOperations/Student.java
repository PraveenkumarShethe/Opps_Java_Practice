package StudentCurdOperations;

import java.util.Objects;

/**
 * Created by Praveenkumar on 12/14/2023.
 *
 *
 * Encapsulation
 */
public class Student {

    Student(){}

    public Student(String name, String lastName, int ID, int age) {
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
        this.age = age;
    }

    private String name;

    private String lastName;

    private int ID;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return ID == student.ID && age == student.age && Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, ID, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                '}';
    }
}
