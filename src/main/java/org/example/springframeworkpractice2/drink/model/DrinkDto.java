package org.example.springframeworkpractice2.drink.model;

import lombok.Getter;

public class DrinkDto {
    @Getter
    public static class Register {
        private String name;
        private Integer price;
        private String manufacturer;
        private List<IngredientsDto.Register> list;

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
