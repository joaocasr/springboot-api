package com.example.restservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restservice.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
