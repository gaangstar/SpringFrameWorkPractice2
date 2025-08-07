package org.example.springframeworkpractice2.drink.controller;

import lombok.RequiredArgsConstructor;
import org.example.springframeworkpractice2.drink.model.DrinkDto;
import org.example.springframeworkpractice2.drink.service.DrinkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/drink")
public class DrinkController {
    private final DrinkService drinkService;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody DrinkDto.Register dto) {
        drinkService.register(dto);
        return ResponseEntity.status(200).body("음료 등록 성공");
    }
}
