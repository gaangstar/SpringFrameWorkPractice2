package org.example.springframeworkpractice2.drink.repository;

import org.example.springframeworkpractice2.drink.model.DrinkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<DrinkEntity, Integer> {

}
