package com.yourpackage.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yourpackage.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
    
    // Custom query to find books by author
    List<Book> findByAuthor(String author);

}
