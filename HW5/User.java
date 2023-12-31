package OOPHW5.Model;

public class User {
    protected String name;
    protected String surname;
    protected int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public User() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return " User: " +
                "Name = " + name  +
                " Surname = " + surname  +
                " Age = " + age;
    }
}
