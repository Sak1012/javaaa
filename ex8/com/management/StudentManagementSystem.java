package com.management;

import com.uni.stud.Student;
import com.uni.teachers.Teachers;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101);
        Teachers teacher = new Teachers("Mr. Smith", "Mathematics");

        System.out.println("Student Information:");
        student.displayStudentInfo();

        System.out.println("\nTeacher Information:");
        teacher.displayTeacherInfo();
    }
}

