package com.example.demo.service;

import com.example.demo.model.User;

public class UserService {
    public boolean validateUser(User user) {
        if (user.getName().length() < 3) {
            System.out.println("Error: Name must be at least 3 characters.");
            return false;
        }
        if (!user.getEmail().contains("@")) {
            System.out.println("Error: Invalid email format.");
            return false;
        }
        if (user.getPassword().length() < 6) {
            System.out.println("Error: Password must be at least 6 characters.");
            return false;
        }
        return true;
    }
}
