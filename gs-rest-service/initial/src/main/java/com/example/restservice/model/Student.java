package com.example.restservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id 
    @GeneratedValue
    @Column(name = "id")
    private String id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "number")
    private int number;
    
    public int getNumber(){
        return number;
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

    public String toString() {
        return String.format(
            "Student[id=%s, name='%s', number='%d']",
            id, name, number);
      }
}
