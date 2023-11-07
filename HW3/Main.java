import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student Uri = new Student("Юрий", "Симонов", 22, "2108");
        Student Michail = new Student("Михаил", "Нечаев", 20, "2107");
        Student Sergei = new Student("Сергей", "Петров", 25, "2107");
        Student Sasha = new Student("Саша", "Иванова", 22, "2108");

        List<Student> numberofGroup = new ArrayList<>();
        numberofGroup.add(Uri);
        numberofGroup.add(Michail);
        numberofGroup.add(Sasha);
        numberofGroup.add(Sergei);

        System.out.println("\n=====================  Вывод списка ========================");
        for (Student number: numberofGroup) {
            System.out.println(number);
        }

        System.out.println("\n=================  Реализация: Iterator   ==================");
        Iterator<Student> iterator = numberofGroup.iterator();
        while (iterator.hasNext()) {
            Student person = iterator.next();
            System.out.println("Имя: " + person.getName());
            System.out.println("Отчество: " + person.getSurname());
            System.out.println("Возраст: " + person.getAge());
            System.out.println("Группа: " + person.getNameofGroup());
            System.out.println("\n");
        }

        System.out.println("\n=================   Реализация: Comporator ===================");
        Comparator<Student> studentComp = new StudentComporator()
                .thenComparing(new StudentComporator.StudentAgeComparator());
        TreeSet<Student> checkStudents = new TreeSet<>(studentComp);

        checkStudents.add(new Student("Николай", "Иванов", 20, "2106"));
        checkStudents.add(new Student("Степан", "Иванов", 22, "2107"));
        checkStudents.add(new Student("Степан", "Лех", 19, "2108"));
        checkStudents.add(new Student("Петр", "Попов", 25, "2107"));
        checkStudents.add(new Student("Светлана", "Иванова", 23, "2108"));
        checkStudents.add(new Student("Светлана", "Жукова", 21, "2108"));
        checkStudents.add(new Student("Александра", "Жукова", 22, "2107"));

        System.out.println("\n---------- Сортировка по имени, потом по возрасту -----------");
        for(Student std : checkStudents){
            System.out.println(std.getName() + " " + std.getSurname() + ", возраст: " + std.getAge() + ", группа: " +std.getNameofGroup() );
        }
    }
}
