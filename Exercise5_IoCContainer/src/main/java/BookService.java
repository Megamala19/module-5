package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for BookRepository, wired centrally via the IoC container
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
