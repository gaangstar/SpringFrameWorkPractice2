package org.example.springframeworkpractice2.book.repository;

import org.example.springframeworkpractice2.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
