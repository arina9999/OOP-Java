package OOPHW5.ServiceGroup;

import OOPHW5.Model.Student;
import OOPHW5.Model.StudyGroup;
import OOPHW5.Model.Teacher;
import java.util.List;

public class StudyGroupService extends StudyGroup {
    private StudyGroup studyGroup;
    List<Student> students;
    public StudyGroupService() {
    }
    public int getTeacherId(Teacher teacher) {
        return teacher.getTID();
    }

    // Возврат созданной группы(Учитель+Студенты)

    public StudyGroup createStudyGroupService(Teacher teacher, List<Student> students) {
        studyGroup = new StudyGroup(teacher, students);
        return studyGroup;
    }
}
