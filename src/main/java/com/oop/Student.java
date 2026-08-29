package com.oop;

public class Student {

    private final String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade); // Reuse validation
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            // For a lab, System.out.println is fine. Just ignore the logpoint warning.
            System.out.println("Invalid grade: " + grade + ". Must be between 0 and 100.");
            return;
        }
        this.grade = grade;
    }

    public void updateGrade(int newGrade) {
        setGrade(newGrade);
    }
}