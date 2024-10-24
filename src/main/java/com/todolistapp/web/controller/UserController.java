package com.todolistapp.web.controller;

import com.todolistapp.domain.user.User;
import com.todolistapp.repository.Task;
import com.todolistapp.service.TaskService;
import com.todolistapp.service.UserService;
import com.todolistapp.web.dto.task.TaskDto;
import com.todolistapp.web.dto.user.UserDto;
import com.todolistapp.web.dto.validation.OnCreate;
import com.todolistapp.web.dto.validation.OnUpdate;
import com.todolistapp.web.mappers.TaskMapper;
import com.todolistapp.web.mappers.UserMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@Validated
public class UserController {

    private final UserService userService;
    private final TaskService taskService;

    private final UserMapper userMapper;
    private final TaskMapper taskMapper;


    @PutMapping
    public UserDto update(@Validated(OnUpdate.class) @RequestBody UserDto dto) {
        User user = userMapper.toEntity(dto);
        User updateUser = userService.update(user);
        return userMapper.toDto(updateUser);
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id){
        User user = userService.getById(id);
        return userMapper.toDto(user);
    }

    @DeleteMapping("/{id}/tasks")
    public void deleteById (@PathVariable Long id) {
        userService.delete(id);
    }

    @GetMapping("{/id/tasks}")
    public List<TaskDto> getByTasksByUserId(@PathVariable Long id){
        return taskMapper.toDto(user);
    }

    @PostMapping("/{id}/tasks")
    public TaskDto createTask (@PathVariable Long id,
                               @Validated(OnCreate.class)@RequestBody TaskDto dto){
        Task task = taskMapper,toEntity(dto);
        Task createdTask = TaskService.create(task, id);
        return taskMapper.toDto(createdTask);
    }
}
