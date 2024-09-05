package com.example.UserTaskManagement.services;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.UserTaskManagement.models.Task;
import com.example.UserTaskManagement.repos.TaskRepo;
import com.example.UserTaskManagement.response.TaskResponsePeagable;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {
    
    private final TaskRepo taskRepo;


    public TaskResponsePeagable listAllTasks(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        Page<Task> myPage = taskRepo.findAll(pageable);

        TaskResponsePeagable taskResponsePeagable = new TaskResponsePeagable();
        taskResponsePeagable.setContent(myPage.getContent());
        taskResponsePeagable.setPageNo(myPage.getNumber());
        taskResponsePeagable.setPageSize(myPage.getNumberOfElements());
        taskResponsePeagable.setTotalPages(myPage.getTotalPages());
        taskResponsePeagable.setLastPage(myPage.isLast());

        return taskResponsePeagable;
    }

    public ResponseEntity<?> saveTask(Task task){
        taskRepo.save(task);
        return ResponseEntity.ok("Your task was saved successfully !");
    }
    
    public ResponseEntity<?> updateTask(Task task){
        taskRepo.save(task);
        return ResponseEntity.ok("Your task was updated successfully !");
    }

    public ResponseEntity<?> deleteTask(Long id){
        taskRepo.deleteById(id);
        return ResponseEntity.ok("Your task was deleted successfully !");
    }

    
}
