package com.example.student.service;
import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;


import java.util.List;

import org.springframework.stereotype.Service;

@Service //Spring ko batata hai “is class ka object tum banao aur sambhalo.” Ye bean ban jaata hai.
public class StudentService {
    private final StudentRepository repo; //Service ko repository chahiye.

    public StudentService(StudentRepository repo ){
        //: Yahi Dependency Injection hai. Tumne kahin new StudentRepository() nahi likha,
        // Spring khud repository bana kar yahan daal deta hai.
        this.repo = repo;
    }
    public List<Student> findAll() {
        return repo.findAll();
        //saare students laao.
    }
    public Student find(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student nahi mila"));
    }

    public Student save(Student student) {
        return repo.save(student);
        //naya student database me daalo.
    }
}


