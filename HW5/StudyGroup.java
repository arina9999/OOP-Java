package OOPHW5.Model;

import java.util.List;
import OOPHW5.Model.Teacher;
import OOPHW5.Model.User;
import OOPHW5.Model.Student;

public class StudyGroup extends User {
    Teacher teacher;
    List<Student> listOfStudent;
    public StudyGroup() {
    }
    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.listOfStudent = students;
    }

    // Возврат ID учителя;
    public int getTeacherID(Teacher teacher) {
        return teacher.teacherID;
    }


    // Возврат ID студента;
    public int getStudentID(Student student){
        return student.getStudentID();
    }

    @Override
    public String toString() {
        return "Преподаватель: "
                + teacher +
                "Студенты:"+ "\n" + listOfStudent;
    }
}
