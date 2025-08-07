package org.example.springframeworkpractice2.drink.service;

import lombok.RequiredArgsConstructor;
import org.example.springframeworkpractice2.drink.model.DrinkDto;
import org.example.springframeworkpractice2.drink.model.DrinkEntity;
import org.example.springframeworkpractice2.drink.repository.DrinkRepository;
import org.example.springframeworkpractice2.ingredients.model.IngredientDto;
import org.example.springframeworkpractice2.ingredients.repository.IngredientRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DrinkService {
    private final DrinkRepository drinkRepository;
    private final IngredientRepository ingredientsRepository;

    public void register(DrinkDto.Register dto) {
        DrinkEntity Drinkentity = drinkRepository.save(dto.toEntity());
        for (IngredientDto.IngredientReq Idto : dto.getList()) {
            ingredientsRepository.save(Idto.toEntity(Drinkentity));

        }
    }
}
