package org.example.springframeworkpractice2.drink.service;

import lombok.RequiredArgsConstructor;
import org.example.springframeworkpractice2.drink.model.DrinkDto;
import org.example.springframeworkpractice2.drink.model.DrinkEntity;
import org.example.springframeworkpractice2.drink.repository.DrinkRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DrinkService {
    private final DrinkRepository drinkRepository;
    private final IngredientsRepository ingredientsRepository;

    public void register(DrinkDto.Register dto) {
        DrinkEntity Drinkentity = drinkRepository.save(dto.toEntity());
        for (IngredientsDto.Register Idto : dto.getList()) {
            ingredientsRepository.save(Idto.toEntity(Drinkentity));

        }
    }
}
