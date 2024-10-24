package com.todolistapp.service.impl;

import com.todolistapp.repository.Task;
import com.todolistapp.repository.TaskRepository;
import com.todolistapp.service.TaskService;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public class TaskServiceimpl implements TaskService {


    @Override
    public Task getById(Long id) {
        return null;
    }

    @Override
    public List<Task> getByUserId(Long id) {
        return List.of();
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public Task create(Task task) {
        return null;
    }


    @Override
    public void delete(Long id) {

    }
}
