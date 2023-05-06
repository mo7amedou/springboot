package com.example.demo15.auth.AuthenticationService;


import com.example.demo15.Config.JwtService;
import com.example.demo15.Repository.UserRep;
import com.example.demo15.User.Role;
import com.example.demo15.User.Users;
import com.example.demo15.auth.AuthenticationRequest;
import com.example.demo15.auth.AuthenticationResponce;
import com.example.demo15.auth.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

import static com.example.demo15.User.Role.ADMIN;
import static com.example.demo15.User.Role.USER;

@Service
@RequiredArgsConstructor
public class AuthenticationService {



    private final UserRep userRep;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public String register(RegisterRequest request) {
        var user = Users.builder()
                .fullName(request.getFullName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Collections.singleton(Role.USER))
                //.role(request.getRole())
                .build();
        userRep.save(user);
        return "ok";
    }

    public AuthenticationResponce authenticate(AuthenticationRequest request) {
        request.getEmail();
        request.getPassword();
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                         request.getEmail(),request.getPassword() )
        );
        var user = userRep.findByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken= jwtService.generateToken(user);
        return AuthenticationResponce.builder()
                .token(jwtToken)
                .build();
    }
}
