package com.todolistapp.service;


import com.todolistapp.repository.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoty {
    Optional<Task> findById(Long id);
    List<Task> findAllById( Long userId);
    void assignToUserById(Long taskId, Long tastId);
    void update(Task task);
    void create(Task task);
    void delete(Task task);
}
