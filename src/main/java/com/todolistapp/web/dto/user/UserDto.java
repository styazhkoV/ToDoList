package com.todolistapp.web.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.todolistapp.domain.user.Role;
import com.todolistapp.repository.Task;
import com.todolistapp.web.dto.validation.OnCreate;
import com.todolistapp.web.dto.validation.OnUpdate;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.List;
import java.util.Set;

@Data
public class UserDto {
    @NotNull(message = "ID пользователя не должно быть пустым",groups = OnUpdate.class)
    private Long id;


    @NotNull(message = "Имя пользователя не должно быть пустым",groups = {OnCreate.class, OnUpdate.class})
    @Length (max = 255, message = "Имя пользователя  должно быть не более 255 символов",groups = {OnCreate.class, OnUpdate.class})
    private String name;


    @NotNull(message = "Имя пользователя не должно быть пустым",groups = {OnCreate.class, OnUpdate.class})
    @Length (max = 255, message = "Имя пользователя  должно быть не более 255 символов",groups = {OnCreate.class, OnUpdate.class})
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Пароль не должен быть пустым",groups = {OnCreate.class, OnUpdate.class})
    private String password;


    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Повтор пароля не должен быть пустым",groups = {OnCreate.class})
    private String passwordConfirmation;
}
