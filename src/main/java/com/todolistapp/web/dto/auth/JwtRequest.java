package com.todolistapp.web.dto.auth;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class JwtRequest {
    @NotNull(message = "Имя пользователя не должно быть пустым")
    private String username;
    @NotNull(message = "Пароль не должен быть пустым")
    private String password;
}
