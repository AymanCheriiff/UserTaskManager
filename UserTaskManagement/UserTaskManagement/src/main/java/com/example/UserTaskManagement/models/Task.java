package com.example.UserTaskManagement.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Task {
    
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate startDate;
    private Float duration;
    private Boolean status;
}
