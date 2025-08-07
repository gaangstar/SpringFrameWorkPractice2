package org.example.springframeworkpractice2.book.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.springframeworkpractice2.review.model.Review;

import java.util.List;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String title;
    private Integer page;
    private Integer price;

    @OneToMany(mappedBy = "book") //book_idx 변수명
    private List<Review> reviewList;
}
