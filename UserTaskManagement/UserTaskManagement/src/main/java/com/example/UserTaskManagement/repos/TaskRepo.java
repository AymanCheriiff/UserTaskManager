package com.example.UserTaskManagement.repos;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserTaskManagement.models.Task;
import com.example.UserTaskManagement.models.User;
import java.util.List;


public interface TaskRepo extends JpaRepository<Task, Long>{
    
    List<User> findByName(String name, Pageable pageable);
}
