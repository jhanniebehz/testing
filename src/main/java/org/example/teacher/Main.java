package org.example.teacher;

import org.example.teacher.model.Teacher;
import org.example.teacher.service.TeacherService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filepath = "/Users/decagon/Desktop/teacher-data - teacher-data.csv.csv";
        List<Teacher>teachers = new ArrayList<>();
        TeacherService.readTeacherFile(teachers, filepath);
        TeacherService.writeTeacherFile(teachers);

    }

}
