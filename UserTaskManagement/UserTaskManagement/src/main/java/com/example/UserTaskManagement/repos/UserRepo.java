package com.example.UserTaskManagement.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserTaskManagement.models.User;


public interface UserRepo extends JpaRepository<User, Long>{
    
    Optional<User> findByEmail(String email);}
