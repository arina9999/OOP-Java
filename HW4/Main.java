import java.util.ArrayList;
import java.util.List;

// Создание класса  Teacher
class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void teach() {
        System.out.println(name);
    }
}

// Создание класса TeacherGroup с параметризацией
class TeacherGroup<T extends Teacher> {
    private List<T> teachers = new ArrayList<>();
    public TeacherGroup() {
        teachers = new ArrayList<>();
    }

    public void addTeacher(T teacher) {
        teachers.add(teacher);
    }

    public void teachAll() {
        for (T teacher : teachers) {
            teacher.teach();
        }
    }
}

// Создание наследников класса Teacher
class MathTeacher extends Teacher {
    public MathTeacher(String name) {
        super(name);
    }
}

class EnglishTeacher extends Teacher {
    public EnglishTeacher(String name) {
        super(name);
    }
}

// Использование наследников класса Teacher с TeacherGroup
public class Main {
    public static void main(String[] args) {
        TeacherGroup<MathTeacher> mathTeacherGroup = new TeacherGroup<>();
        TeacherGroup<EnglishTeacher> englishTeacherGroup = new TeacherGroup<>();

        MathTeacher mathTeacher1 = new MathTeacher("John");
        MathTeacher mathTeacher2 = new MathTeacher("Mary");
        mathTeacherGroup.addTeacher(mathTeacher1);
        mathTeacherGroup.addTeacher(mathTeacher2);

        EnglishTeacher englishTeacher1 = new EnglishTeacher("Peter");
        EnglishTeacher englishTeacher2 = new EnglishTeacher("Jane");
        englishTeacherGroup.addTeacher(englishTeacher1);
        englishTeacherGroup.addTeacher(englishTeacher2);

        System.out.println("mathTeacherGroup:");
        mathTeacherGroup.teachAll();
        System.out.println("englishTeacherGroup:");
        englishTeacherGroup.teachAll();
    }
}
