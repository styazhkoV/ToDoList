package com.todolistapp.service.impl;

import com.todolistapp.domain.user.User;
import com.todolistapp.service.UserService;


public  class UserServiceimpl implements UserService {

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public boolean IsTaskOuner(Long userId, Long TaskId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}

