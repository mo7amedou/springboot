package com.example.demo15.initializer;

import com.example.demo15.Config.JwtService;
import com.example.demo15.Repository.UserRep;
import com.example.demo15.User.Role;
import com.example.demo15.User.Users;
import com.example.demo15.auth.AuthenticationResponce;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;


@Component
@RequiredArgsConstructor
public class DataInitializer implements ApplicationRunner {

    @Autowired
    private UserRep userRep;
    private JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Users user = new Users();
        user.setFullName("admin");
        user.setEmail("admin");
        user.setPassword(passwordEncoder.encode("admin"));
        user.setRole(Role.ADMIN);
        userRep.save(user);
        //jwtService.generateToken(user);
    }
}
