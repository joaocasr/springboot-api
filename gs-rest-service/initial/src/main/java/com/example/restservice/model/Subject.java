package com.example.restservice.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name="subject")
public class Subject {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "name")
    private String name;

    @Column(name = "docente")
    private String docente;

    @JsonIgnore 
    @ManyToMany
    @JoinTable(name = "subject_student",
        joinColumns = { @JoinColumn(name = "fk_subject") },
        inverseJoinColumns = { @JoinColumn(name = "fk_student") })
    private List<Student> students;
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public List<Student> getStudents() {
        return students;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDocente() {
        return docente;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDocente(String docente) {
        this.docente = docente;
    }
    @Override
    public String toString() {
        return "Subject [id=" + id + ", name=" + name + ", docente=" + docente + "]";
    }

    
}
