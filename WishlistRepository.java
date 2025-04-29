package com.yourpackage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yourpackage.model.Wishlist;

public interface WishlistRepository extends MongoRepository<Wishlist, String> {
    // You can add custom queries here if needed
}
