package org.example.springframeworkpractice2.drink.model;

import lombok.Getter;
import org.example.springframeworkpractice2.ingredients.model.IngredientDto;

import java.util.List;

public class DrinkDto {
    @Getter
    public static class Register {
        private String name;
        private Integer price;
        private String manufacturer;
        private List<IngredientDto.IngredientReq> list;

        public DrinkEntity toEntity() {
            DrinkEntity entity = DrinkEntity.builder()
                    .name(name)
                    .price(price)
                    .manufacturer(manufacturer)
                    .build();
            return entity;
        }
    }
}
