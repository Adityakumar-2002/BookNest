package com.yourpackage.service;

import org.springframework.stereotype.Service;

import com.yourpackage.model.User;

@Service
public class UserService {

    public void saveUser(User user) {
        // Add your logic here to save user, e.g., to a database
        System.out.println("User saved: " + user.getUsername());
    }

    public User findByUsername(String username) {
        // Your logic to find a user by username, e.g., from a database
        // This is a dummy user for example purpose
        User user = new User();
        user.setUsername(username);
        user.setPassword("dummyPassword"); // Replace with actual logic
        return user;
    }
}
