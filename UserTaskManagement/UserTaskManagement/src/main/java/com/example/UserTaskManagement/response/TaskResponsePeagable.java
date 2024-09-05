package com.example.UserTaskManagement.response;

import java.util.List;

import com.example.UserTaskManagement.models.Task;

import lombok.Data;

@Data
public class TaskResponsePeagable {
    private List<Task> content;
    private Integer pageNo;
    private Integer pageSize;
    private Integer totalPages;
    private Boolean lastPage;
}
