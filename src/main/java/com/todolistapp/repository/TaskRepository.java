package com.todolistapp.repository;

import com.todolistapp.domain.task.Task;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    Optional<Task> findById(Long id);
    List<Task> finfAllByUserId (Long userId);
    void assignToUserById (Long taskId, Long userId);
    void update (Task task);
    void create (Task task);
    void delete(Long id);
}

