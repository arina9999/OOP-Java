package OOPHW5.Model;

import java.util.List;
import OOPHW5.Model.Teacher;
import OOPHW5.Model.User;
import OOPHW5.Model.StudyGroup;


public class Student extends User {
    protected int studentID;

    public Student(String name, String surname, int age, int studentID) {
        super(name, surname, age);
        this.studentID = studentID;
    }

    // Возврат ID студента;
    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "\n" +
                " ID: " + studentID +
                ",   " + name  +
                " " + surname;
    }
}
