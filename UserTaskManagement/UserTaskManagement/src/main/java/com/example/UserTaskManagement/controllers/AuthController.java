package com.example.UserTaskManagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserTaskManagement.models.AuthUser;
import com.example.UserTaskManagement.models.User;
import com.example.UserTaskManagement.services.UserService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
public class AuthController {
    
    private final UserService userService;

    @PostMapping("register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("login")
    public ResponseEntity<?> loginUser(@RequestBody AuthUser user) {
        return userService.loginUser(user);
    }

    
    
}
