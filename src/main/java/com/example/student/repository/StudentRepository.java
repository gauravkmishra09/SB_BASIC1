package com.example.student.repository;
import com.example.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Long>{
    //bas itna likhne se save(), findById(), findAll(), deleteById() sab mil jaate hain.

   // Student = kis table ka data, Long = uske id ka type.
}
