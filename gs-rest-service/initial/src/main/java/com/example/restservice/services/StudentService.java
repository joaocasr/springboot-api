package com.example.restservice.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.restservice.model.Student;

public interface StudentService {
    ResponseEntity<List<Student>> getAllStudents();
    ResponseEntity<Student> getStudentById(String id);
    
}
