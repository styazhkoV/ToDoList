package com.todolistapp.domain.user;

import com.todolistapp.domain.task.Task;
import lombok.Data;

import java.util.List;
import java.util.Set;


@Data
public class User {
    private Long id;
    private String name;
    private String password;
    private String passwordConfirmition;
    private Set<Role> rolles;
    private List<Task> tasks;
}
