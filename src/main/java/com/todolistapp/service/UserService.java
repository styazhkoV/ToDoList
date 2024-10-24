package com.todolistapp.service;

import com.todolistapp.domain.user.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User getById(Long id);
    User getByUsername(String username);
    User update (User user);
    User create (User user);
    boolean IsTaskOuner(Long userId, Long TaskId);
    void delete(Long id);
}
