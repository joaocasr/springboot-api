package com.example.restservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.model.Student;
import com.example.restservice.repository.StudentRepository;

@RestController
public class StudentController{

    @Autowired
    private StudentRepository studentRepository;

    @SuppressWarnings("null")
    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudents(){
        try{
            List<Student> alunos = new ArrayList<Student>();
            studentRepository.findAll().forEach(x->alunos.add(x));
            System.out.println(studentRepository.findAll());
            System.out.println(alunos);
            return new ResponseEntity<>(alunos, HttpStatus.OK);
        }catch(Exception err){
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}