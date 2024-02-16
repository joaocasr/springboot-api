package com.example.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restservice.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
