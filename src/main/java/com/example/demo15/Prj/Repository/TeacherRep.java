package com.example.demo15.Prj.Repository;
import com.example.demo15.Prj.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRep extends JpaRepository<Teacher , Integer> {
}
