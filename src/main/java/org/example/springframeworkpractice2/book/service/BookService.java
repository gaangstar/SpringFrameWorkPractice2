package org.example.springframeworkpractice2.book.service;

import lombok.*;
import org.example.springframeworkpractice2.book.model.BookDto;
import org.example.springframeworkpractice2.book.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void register(BookDto.BookReq dto) {
        bookRepository.save(dto.toEntity());
    }
}
