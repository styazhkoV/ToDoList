package com.todolistapp.web.mappers;

import com.todolistapp.domain.user.User;
import com.todolistapp.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface UserMapper {

    UserDto toDto (User user);

    User toEntity(UserDto dto);
}


