package org.example.student.service;

import org.example.student.model.Student;

import java.io.*;
import java.util.List;

public class StudentService {

    public static void readFile(List<Student> students, String filePath) {

        try {
            BufferedReader brr = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = brr.readLine()) != null) {
                String[] values = line.split(",", -1);
                for (int i = 0; i < values.length; i++) {
                    if(values[i].isEmpty()){
                        values[i] = "null";
                    }
                }
                Student student = new Student(values[0], values[1], values[2], values[3],
                        values[4],values[5], values[6], values[7], values[8]);
                students.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(Student student : students){
            System.out.println(student);
        }


    }


    public static void writeFile(List<Student>students){

        String destinationPath = System.getProperty("user.home") + "/IdeaProjects/Week4Task/src/main/resources/student/";

        try{
            FileWriter fwr = new FileWriter(destinationPath + "student_output1.csv");
            for(Student student : students){
                fwr.write(student.getStudentId() + ",");
                fwr.write(student.getFirstName() + ",");
                fwr.write(student.getLastName() + ",");
                fwr.write(student.getGradeLevel() + ",");
                fwr.write(student.getEmailAddress() + ",");
                fwr.write(student.getGuardianEmail1() + ",");
                fwr.write(student.getGuardianEmail2() + ",");
                fwr.write(student.getIsArchived() + ",");
                fwr.write(student.getIsDeleted() + "\n");

            }
            fwr.close();
            System.out.println("Successfully written to a new csv file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
