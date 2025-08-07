package org.example.springframeworkpractice2.review.controller;

import lombok.RequiredArgsConstructor;
import org.example.springframeworkpractice2.book.model.Book;
import org.example.springframeworkpractice2.review.model.ReviewDto;
import org.example.springframeworkpractice2.review.service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody ReviewDto.Register dto) {
        reviewService.register(dto);
        return ResponseEntity.status(200).body("리뷰 등록 성공");
    }
}
