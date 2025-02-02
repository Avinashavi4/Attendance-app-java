package com.example;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Create User Object
        User user = new User(name, email, password);
        UserService userService = new UserService();

        // Validate and Register User
        if (userService.validateUser(user)) {
            user.displayUser();
            System.out.println("User Registration Successful!");
        } else {
            System.out.println("User Registration Failed!");
        }

        scanner.close();
    }
}
