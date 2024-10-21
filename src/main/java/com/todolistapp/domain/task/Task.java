package com.todolistapp.domain.task;

import jdk.jshell.Snippet;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Task {
    private Long id;
    private String title;
    private String description;
    private Snippet.Status status;
    private LocalDateTime expirationDate;

}
