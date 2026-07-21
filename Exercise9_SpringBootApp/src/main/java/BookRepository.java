package com.library.repository;

import com.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// BookRepository interface (Exercise 9) — Spring Data JPA gives CRUD methods for free
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
