package com.demo.auth;

public class AuthService {
    public boolean login(String username, String password) {
        // Dummy auth logic
        return "admin".equals(username) && "admin123".equals(password);
    }
}
