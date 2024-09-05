package com.example.UserTaskManagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserTaskManagement.models.Task;
import com.example.UserTaskManagement.response.TaskResponsePeagable;
import com.example.UserTaskManagement.services.TaskService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("task")
@RequiredArgsConstructor
public class TaskController {
    
    private final TaskService taskService;

    @GetMapping("get/all")
    public TaskResponsePeagable listAllTasks( @RequestParam int page,
                                @RequestParam int size) {
        return taskService.listAllTasks(page, size);
    }

    @PostMapping("save")
    public ResponseEntity<?> saveTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }

    @PutMapping("update")
    public ResponseEntity<?> updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id){
        return taskService.deleteTask(id);
    }
}
