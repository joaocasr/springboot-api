package com.example.restservice.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "number")
    private int number;

    @JsonIgnore
    @ManyToMany(mappedBy = "students")
    private List<Subject> mysubjects;
    
    public int getNumber(){
        return number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Subject> getSubjects() {
        return mysubjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.mysubjects = new ArrayList<>(subjects);
    }

    public String getName(){
        return name;
    }
    public void setNumber(int numero){
        this.number=numero;
    }

    public void setName(String nome){
        this.name=nome;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", number=" + number + "]";
    }

}
