package com.example.student.controller;
import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController //ye class web request handle karegi aur jo return karegi use JSON bana dega.

@RequestMapping("/students") //is class ke saare URLs /students se shuru honge.
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        //wahi DI(dependency injection), Spring service bana kar de deta hai.
        this.service = service;
    }
    @GetMapping
    public List<Student> all() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Student get(@PathVariable Long id) {
        return service.find(id);
    }

    @PostMapping
    public Student add(@RequestBody Student student) { //@RequestBody Student student: bheja hua JSON ko Student object me badal do.
        return service.save(student);

    }
}