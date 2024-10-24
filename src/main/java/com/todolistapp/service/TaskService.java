package com.todolistapp.service;

import com.todolistapp.repository.Task;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TaskService {

    Task getById(Long id);
    List<Task> getByUserId (Long id);
    Task update (Task task);
    Task create (Task task, Long id);
    void delete (Long id);
}
