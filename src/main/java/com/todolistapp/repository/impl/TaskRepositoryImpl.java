package com.todolistapp.repository.impl;

import com.todolistapp.repository.Task;
import com.todolistapp.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskRepositoryImpl implements TaskService {


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
