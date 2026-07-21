package com.library.repository;

public class BookRepository {

    public void addBook(String bookName) {
        System.out.println("Book added to repository: " + bookName);
    }

    public void deleteBook(String bookName) {
        System.out.println("Book deleted from repository: " + bookName);
    }
}
