package com.yourpackage.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "wishlists")  // MongoDB collection name is 'wishlists'
public class Wishlist {
    @Id
    private String id;
    private String userId;  // User ID to associate this wishlist with a user
    private List<String> bookIds;  // List of Book IDs (could also be full Book objects)

    // Optional: Add constructors if needed, Lombok handles most of it.
}
