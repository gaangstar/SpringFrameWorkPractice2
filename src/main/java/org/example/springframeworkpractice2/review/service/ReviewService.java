package org.example.springframeworkpractice2.review.service;

import lombok.RequiredArgsConstructor;
import org.example.springframeworkpractice2.review.model.ReviewDto;
import org.example.springframeworkpractice2.review.repository.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public void register(ReviewDto.Register dto) {
        reviewRepository.save(dto.toEntity());
    }
}
