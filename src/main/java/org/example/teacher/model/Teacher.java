package org.example.teacher.model;

public class Teacher {
    private String teacherId;
    private String emailAddress;
    private String firstname;
    private String lastName;


    public Teacher(String teacherId, String emailAddress, String firstname, String lastName) {
        this.teacherId = teacherId;
        this.emailAddress = emailAddress;
        this.firstname = firstname;
        this.lastName = lastName;
    }


    public String getTeacherId() {
        return teacherId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return teacherId + '\'' + "  " +
                emailAddress + '\'' + "  " +
                firstname + '\'' + "  " +
                lastName + '\''  + "  ";
    }
}

