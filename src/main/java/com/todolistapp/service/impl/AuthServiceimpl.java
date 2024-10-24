package com.todolistapp.service.impl;

import com.todolistapp.service.AuthService;
import com.todolistapp.web.dto.auth.JwtRequest;
import com.todolistapp.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceimpl implements AuthService {

    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
