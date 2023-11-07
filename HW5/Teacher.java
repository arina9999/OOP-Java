package OOPHW5.Model;

import OOPHW5.Model.User;

public class Teacher extends User {
    protected String subject;
    protected int teacherID;

    public Teacher(String name, String surname, int age, String subject, int teacherID) {
        super(name, surname, age);
        this.subject = subject;
        this.teacherID = teacherID;
    }

    // Возврат ID учителя;
        public int getTID() {
        return teacherID;
    }

    @Override
    public String toString() {
        return name + "" +
               surname + ", " +
               "Id: " + teacherID + "\n";
    }
}
