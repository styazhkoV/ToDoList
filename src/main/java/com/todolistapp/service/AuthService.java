package com.todolistapp.service;

import com.todolistapp.web.dto.auth.JwtRequest;
import com.todolistapp.web.dto.auth.JwtResponse;

public interface AuthService {
    JwtResponse login (JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);


}
