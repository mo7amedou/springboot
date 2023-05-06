package com.example.demo15.Prj.Repository;
import com.example.demo15.Prj.Entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRep extends JpaRepository<Session , Integer> {
}
