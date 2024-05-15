package org.example.student.model;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private String gradeLevel;
    private String emailAddress;
    private String guardianEmail1;
    private String guardianEmail2;
    private String isArchived;
    private String isDeleted;

    public Student(String studentId, String firstName, String lastName, String gradeLevel,
                   String emailAddress, String guardianEmail1, String guardianEmail2, String isArchived,
                   String isDeleted) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.emailAddress = emailAddress;
        this.guardianEmail1 = guardianEmail1;
        this.guardianEmail2 = guardianEmail2;
        this.isArchived = isArchived;
        this.isDeleted = isDeleted;
    }


    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getGuardianEmail1() {
        return guardianEmail1;
    }

    public String getGuardianEmail2() {
        return guardianEmail2;
    }

    public String getIsArchived() {
        return isArchived;
    }

    public String getIsDeleted() {
        return isDeleted;
    }


    @Override
    public String toString() {
        return studentId + '\'' +
                firstName + '\'' +
                lastName + '\'' +
                gradeLevel + '\'' +
                emailAddress + '\'' +
                guardianEmail1 + '\'' +
                guardianEmail2 + '\'' +
                isArchived + '\'' +
                isDeleted + '\'' ;
    }
}
