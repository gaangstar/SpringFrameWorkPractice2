package org.example.springframeworkpractice2.book.model;

import lombok.*;

public class BookDto {
    //요청 데이터
    @Getter
    public static class BookReq {
        private String title;
        private Integer page;
        private Integer price;

        public Book toEntity() {
            return Book.builder()
                    .title(title)
                    .page(page)
                    .price(price)
                    .build();
        }
    }


    //응답 데이터
    @Getter
    @Builder
    public static class BookRes {
        private Integer idx;
        private String title;
        private Integer page;
        private Integer price;

        public BookRes from(Book book) {
            return BookRes.builder()
                    .idx(book.getIdx())
                    .title(book.getTitle())
                    .page(book.getPage())
                    .price(book.getPrice())
                    .build();
        }
    }
}
