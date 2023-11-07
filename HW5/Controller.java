package OOPHW5.Controller;

import OOPHW5.Model.Student;
import OOPHW5.Model.StudyGroup;
import OOPHW5.Model.Teacher;
import OOPHW5.ServiceGroup.StudyGroupService;
import java.util.List;

public class Controller extends StudyGroupService {

    StudyGroupService studyGroupService;
    StudyGroup studyGroup = new StudyGroup();
    public Controller() {
        super();
        this.studyGroupService = new StudyGroupService();
    }

    // Создание группы(Учитель+Студенты)
    public StudyGroup showGroup(Teacher teacher, List<Student> listOfStudents) {
        if (teacher != null && listOfStudents != null) {
            studyGroup = studyGroupService.createStudyGroupService(teacher, listOfStudents);
        } else {
            System.out.println("Невозможно создать группу!");
        }
        return studyGroup;
    }
}
