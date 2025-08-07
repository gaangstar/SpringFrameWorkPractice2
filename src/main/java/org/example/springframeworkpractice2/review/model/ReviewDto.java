package org.example.springframeworkpractice2.review.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ReviewDto {
    @Getter
    @NoArgsConstructor
    @Setter
    public static class Register {
        private String contents;
        private Integer score;

        public ReviewEntity toEntity() {
            ReviewEntity entity = ReviewEntity.builder()
                    .contents(contents)
                    .score(score)
                    .book(book)
                    .build();
            return entity;
        }
    }
}
