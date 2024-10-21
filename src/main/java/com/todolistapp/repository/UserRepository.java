package com.todolistapp.repository;

import com.todolistapp.domain.user.Role;
import com.todolistapp.domain.user.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);
    Optional<User> findBuUsername(String username);
        void update(User user);
        void create (User user);
        void insertUserRole (Long userId, Role role);
        boolean isTaskOwner(Long userId, long taskId);
        void delete (Long id);
}
