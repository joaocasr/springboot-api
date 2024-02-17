package com.example.restservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.model.Student;
import com.example.restservice.repositories.StudentRepository;
import com.example.restservice.services.StudentService;

@RestController
public class StudentController implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudents(){
        try{
            List<Student> alunos = new ArrayList<Student>();
            studentRepository.findAll().forEach(x->alunos.add(x));
            return new ResponseEntity<>(alunos, HttpStatus.OK);
        }catch(Exception err){
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") String idstudent) {
        try{
            Optional<Student> s= studentRepository.findById(idstudent);
            return new ResponseEntity<>(s.get(),HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }
}