package com.example.demo15.Prj.Repository;
import com.example.demo15.Prj.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRep extends JpaRepository<Student , Integer> {
}
