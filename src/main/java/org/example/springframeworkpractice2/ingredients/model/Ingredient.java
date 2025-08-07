package org.example.springframeworkpractice2.ingredients.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.springframeworkpractice2.drink.model.DrinkEntity;


@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String name;
    private Integer gram;

    @ManyToOne()
    @JoinColumn(name = "drink_idx")
    private DrinkEntity drink;
}
