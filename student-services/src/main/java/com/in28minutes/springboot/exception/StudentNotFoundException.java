package com.in28minutes.springboot.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String studentId) {
        super("Student not found: " + studentId);
    }
}
