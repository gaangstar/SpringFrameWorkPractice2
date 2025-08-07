package org.example.springframeworkpractice2.drink.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springframeworkpractice2.ingredients.model.Ingredient;

import java.util.List;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrinkEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String name;
    private Integer price;
    private String manufacturer;

    @OneToMany(mappedBy = "drink")
    private List<Ingredient> list;
}
