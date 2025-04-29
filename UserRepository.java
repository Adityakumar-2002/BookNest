package com.yourpackage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yourpackage.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    // You can add custom queries here if needed
    User findByUsername(String username);
}
