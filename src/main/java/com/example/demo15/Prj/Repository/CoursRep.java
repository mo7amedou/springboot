package com.example.demo15.Prj.Repository;
import com.example.demo15.Prj.Entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRep extends JpaRepository<Cours , Integer> {
}
