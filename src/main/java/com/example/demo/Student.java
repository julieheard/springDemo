package com.example.demo;

public class Student {
    private String studentName;
    private String classCode;

    public Student(String studentName, String classCode) {
        this.studentName = studentName;
        this.classCode = classCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }
}
