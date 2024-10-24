package com.todolistapp.web.controller;

import com.todolistapp.repository.Task;
import com.todolistapp.service.TaskService;
import com.todolistapp.web.dto.task.TaskDto;
import com.todolistapp.web.dto.validation.OnUpdate;
import com.todolistapp.web.mappers.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
@Validated
public class TaskController {

    private final TaskService taskService;


    private final TaskMapper taskMapper;


    @PutMapping
    public TaskDto update(@Validated(OnUpdate.class) TaskDto dto) {
        Task task = taskMapper.toEntity(dto);
        Task updatetTask = taskService.update(task);
             return taskMapper.toDto(updatetTask);
    }

    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable Long id){
        Task task = taskService.getById(id);
        return taskMapper.toDto(task);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        taskService.delete(id);
    }
}
