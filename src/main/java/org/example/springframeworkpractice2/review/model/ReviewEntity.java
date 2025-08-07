package org.example.springframeworkpractice2.review.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springframeworkpractice2.book.model.Book;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String contents;
    private Integer score;

    @ManyToOne
    @JoinColumn(name = "book_idx")
    private Book book;
}
