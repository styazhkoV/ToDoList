package com.todolistapp.service;

import com.todolistapp.domain.user.User;

public interface UserService {

    User getById(Long id);
    User getByUsername(String username);
    User update (User user);
    User isTaskOwner(Long userId, Long taskId);
    void delete(Long id);
}
