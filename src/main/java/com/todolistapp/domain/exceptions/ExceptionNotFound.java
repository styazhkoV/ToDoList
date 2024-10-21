package com.todolistapp.domain.exceptions;

public class ExceptionNotFound extends RuntimeException {
    public ExceptionNotFound(String message) {
        super(message);
    }
}
