package com.todolistapp.web.dto.task;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.todolistapp.web.dto.validation.OnCreate;
import com.todolistapp.web.dto.validation.OnUpdate;
import jakarta.validation.constraints.NotNull;
import jdk.jshell.Snippet;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
@Data
public class TaskDto {

    @NotNull(message = "ID пользователя не должно быть пустым",groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Заголовок не должен быть пустым", groups = {OnUpdate.class, OnUpdate.class})
    @Length(max = 255, message = "Заголовок не должен быть не более 255 символов",groups = {OnCreate.class, OnUpdate.class})
    private String title;

    @Length(max = 255, message = "Описание не должно быть не более 255 символов",groups = {OnCreate.class, OnUpdate.class})
    private String description;


    private Snippet.Status status;


    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME )
    @JsonFormat(timezone = "yyyy-mm-dd-hh-mm")
    private LocalDateTime expirationDate;
}

