package com.java.todo_management.service;

import com.java.todo_management.dto.LoginDto;
import com.java.todo_management.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);
}
