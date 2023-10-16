package com.uni.teachers;

public class Teachers {
    private String name;
    private String subject;

    public Teachers(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayTeacherInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

