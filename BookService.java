package com.yourpackage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yourpackage.model.Book;
import com.yourpackage.repository.BookRepository;

@Service  // Marks this class as a Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired  // Automatically injects the BookRepository instance
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Save a new book to the database
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // Get all books from the database
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Get a specific book by its ID
    public Optional<Book> getBookById(String id) {
        return bookRepository.findById(id);
    }

    // Find books by author using a custom query method
    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }
}
