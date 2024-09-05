package com.example.UserTaskManagement.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.UserTaskManagement.models.AuthUser;
import com.example.UserTaskManagement.models.User;
import com.example.UserTaskManagement.repos.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserRepo userRepo;


    public ResponseEntity<?> registerUser(User user){
        if(userRepo.findByEmail(user.getEmail()).isPresent()){
            return ResponseEntity.badRequest().body("User with this email already exists !");
        }else{
            userRepo.save(user);
            return ResponseEntity.ok("Regsitration success !");
        }
    }

    public ResponseEntity<?> loginUser(AuthUser authUser){
        if (userRepo.findByEmail(authUser.getEmail()).isPresent()) {
            if(userRepo.findByEmail(authUser.getEmail()).get().getPassword().equals(authUser.getPassword())){
                return ResponseEntity.ok("Login success !");
            }else{
                return ResponseEntity.badRequest().body("User password is incorrect !");
            }
        }else{
            return ResponseEntity.badRequest().body("No matched account with this email !");
        }
    }
}
