package org.example.student;

import org.example.student.model.Student;
import org.example.student.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filepath = "/Users/decagon/Desktop/studentData.csv.csv";
        List<Student>students = new ArrayList<>();

        StudentService.readFile(students, filepath);
        StudentService.writeFile(students);


    }
}
