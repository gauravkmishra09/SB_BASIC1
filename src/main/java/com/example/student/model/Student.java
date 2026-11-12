package com.example.student.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //Spring ko batata hai “is class ki ek table database me banao.”
public class Student {
    @Id //ye field table ka primary key hai (har student ki unique pehchaan).

    @GeneratedValue(strategy = GenerationType.IDENTITY) //database 1, 2, 3 khud dega.

//   table ke 3 column==
    private long id;
    private String name;
    private String branch;

    public Student(){ //khali Spring ko object banane ke liye chahiye hota hai.
    }

  //  getters/setters: field ki value padhne aur badalne ke liye.
    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name; }


    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }
}
