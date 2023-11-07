package OOPHW5.View;

import OOPHW5.Controller.Controller;
import OOPHW5.Model.Student;
import OOPHW5.Model.Teacher;

import java.util.List;

public class ModelView {
    Controller controllerView = new Controller();

    public ModelView(){
    }
    public void getTeacherID(Controller controllerView ,Teacher teacher){
        System.out.println("Teacher ID: " + controllerView.getTeacherID(teacher));
    }
    public void getStudentID(Controller controllerView , Student student){
        System.out.println("Student ID: " + controllerView.getStudentID(student));
    }
    public void getAllGroup( List<Student> studentList,Teacher teacher,Controller controllerView){
        System.out.println(controllerView.showGroup(teacher,studentList));
    }
}
