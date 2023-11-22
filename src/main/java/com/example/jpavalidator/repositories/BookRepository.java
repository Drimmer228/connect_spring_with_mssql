package com.example.jpavalidator.repositories;

import com.example.jpavalidator.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookModel, Long> {
    List<BookModel> findByAuthor(String author);
}
