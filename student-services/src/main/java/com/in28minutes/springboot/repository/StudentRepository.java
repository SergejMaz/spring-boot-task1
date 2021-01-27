package com.in28minutes.springboot.repository;

import java.util.List;

import com.in28minutes.springboot.model.Student;


public interface StudentRepository {
    List<Student> retrieveAllStudents();

    Student getStudentByStudentId(String studentId);
}
