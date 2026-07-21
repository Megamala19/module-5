package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for BookRepository — this is what applicationContext.xml
    // uses to inject the dependency (setter-based Dependency Injection)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        bookRepository.addBook(bookName);
    }

    public void deleteBook(String bookName) {
        bookRepository.deleteBook(bookName);
    }
}
