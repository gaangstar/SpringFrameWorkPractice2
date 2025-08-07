package org.example.springframeworkpractice2.review.model;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.springframeworkpractice2.book.model.Book;

public class ReviewDto {
    @Getter
    @NoArgsConstructor
    @Setter
    public static class Register {
        private String contents;
        private Integer score;
        private Integer book_id;

        public ReviewEntity toEntity(Book book) {
            ReviewEntity entity = ReviewEntity.builder()
                    .contents(contents)
                    .score(score)
                    .book(book)
                    .build();
            return entity;
        }
    }
}
