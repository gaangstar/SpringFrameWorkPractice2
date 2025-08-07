package org.example.springframeworkpractice2.ingredients.model;

import lombok.*;

public class IngredientDto {

    //요청 데이터
    @Getter
    @NoArgsConstructor
    public static class IngredientReq {
        private String name;
        private Integer gram;

        public Ingredient toEntity(Drink drink) {
            return Ingredient.builder()
                    .name(name)
                    .gram(gram)
                    .drink(drink)
                    .build();
        }
    }

    //응답 데이터
    @Getter
    @Builder
    public static class IngredientRes {
        private Integer idx;
        private String name;
        private Integer gram;

        public IngredientRes from(Ingredient ingredient) {
            return IngredientRes.builder()
                    .idx(ingredient.getIdx())
                    .name(ingredient.getName())
                    .gram(ingredient.getGram())
                    .build();
        }
    }
}
