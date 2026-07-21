package com.library.repository;

import org.springframework.stereotype.Repository;

// @Repository annotation replaces the XML <bean> definition (Exercise 6)
@Repository
public class BookRepository {

    public void addBook(String bookName) {
        System.out.println("Book added to repository: " + bookName);
    }

    public void deleteBook(String bookName) {
        System.out.println("Book deleted from repository: " + bookName);
    }
}
