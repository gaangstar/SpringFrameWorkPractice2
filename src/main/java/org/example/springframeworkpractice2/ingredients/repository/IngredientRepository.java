package org.example.springframeworkpractice2.ingredients.repository;

import org.example.springframeworkpractice2.ingredients.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient,Integer> {
}
