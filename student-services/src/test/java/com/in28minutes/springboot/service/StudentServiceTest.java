package com.in28minutes.springboot.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.in28minutes.springboot.exception.StudentNotFoundException;
import com.in28minutes.springboot.repository.StudentRepository;

class StudentServiceTest {

    private static final String STUDENT_ID = "id-01";
    private StudentRepository mockRepo;
    private StudentService studentService;

    @BeforeEach
    void setUp() {
        this.mockRepo = Mockito.mock(StudentRepository.class);
        this.studentService = new StudentService(mockRepo);
    }

    @Test
    void retrieveStudent_when_studentId_not_found() {
        Mockito.when(mockRepo.getStudentByStudentId(STUDENT_ID)).thenThrow(new StudentNotFoundException(STUDENT_ID));

        Assertions.assertThrows(StudentNotFoundException.class, () -> studentService.retrieveStudent(STUDENT_ID));
    }

    @Test
    void retrieveCourses() {
    }

    @Test
    void retrieveCourse() {
    }

    @Test
    void addCourse() {
    }
}