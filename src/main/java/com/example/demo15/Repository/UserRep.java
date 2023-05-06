package com.example.demo15.Repository;

import com.example.demo15.User.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRep extends JpaRepository<Users ,Integer> {
    Optional<Users> findByEmail(String email);
}
