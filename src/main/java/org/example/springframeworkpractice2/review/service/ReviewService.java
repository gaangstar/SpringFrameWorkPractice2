package org.example.springframeworkpractice2.review.service;

import lombok.RequiredArgsConstructor;
import org.example.springframeworkpractice2.book.model.Book;
import org.example.springframeworkpractice2.book.repository.BookRepository;
import org.example.springframeworkpractice2.review.model.ReviewDto;
import org.example.springframeworkpractice2.review.model.ReviewEntity;
import org.example.springframeworkpractice2.review.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;

    public void register(ReviewDto.Register dto) {
        Optional<Book> entity = bookRepository.findById(dto.getBook_id());

        reviewRepository.save(dto.toEntity(entity.get()));
    }
}
