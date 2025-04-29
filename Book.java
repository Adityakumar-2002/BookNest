package com.yourpackage.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "books")  // MongoDB collection name is 'books'
public class Book {
    @Id
    private String id;  // MongoDB will use this as the primary key
    private String title;
    private String author;
    private String description;
    private String genre;
    private Double price;

    // Optional: Add constructors if needed, Lombok handles most of it.
}
