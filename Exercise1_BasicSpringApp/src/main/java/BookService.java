package com.library.service;

public class BookService {

    public void addBook(String bookName) {
        System.out.println("BookService: handling addBook for " + bookName);
    }

    public void deleteBook(String bookName) {
        System.out.println("BookService: handling deleteBook for " + bookName);
    }
}
