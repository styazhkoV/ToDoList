package com.todolistapp.service.impl;

import com.todolistapp.domain.user.Role;
import com.todolistapp.domain.user.User;
import com.todolistapp.repository.UserRepository;

import java.util.Optional;

public class UserRepositoryimpl implements UserRepository {
    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findBuUsername(String username) {
        return Optional.empty();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void create(User user) {

    }

    @Override
    public void insertUserRole(Long userId, Role role) {

    }

    @Override
    public boolean isTaskOwner(Long userId, Long taskId) {
        return false;
    }

    @Override
    public boolean isTaskOwner(Long userId, long taskId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}
