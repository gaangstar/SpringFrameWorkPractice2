package org.example.springframeworkpractice2.review.repository;

import org.example.springframeworkpractice2.review.model.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Integer> {
}
