package com.yourpackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yourpackage.model.Book;
import com.yourpackage.service.BookService;

@RestController  // Marks this class as a REST controller
@RequestMapping("/api/books")  // Base URL for all routes related to books
public class BookController {

    private final BookService bookService;

    @Autowired  // Automatically injects the BookService instance
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Other methods...

    // New endpoint to find books by author
    @GetMapping("/author/{author}")  // HTTP GET request for finding books by author
    public List<Book> getBooksByAuthor(@PathVariable String author) {
        return bookService.getBooksByAuthor(author);  // Calls the service method
    }
}
