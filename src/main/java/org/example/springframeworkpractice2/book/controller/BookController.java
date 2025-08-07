package org.example.springframeworkpractice2.book.controller;

import lombok.RequiredArgsConstructor;
import org.example.springframeworkpractice2.book.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    //책 등록
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody BookDto.BookReq dto) {
        bookService.register(dto);
        return ResponseEntity.status(200).body("register success");
    }
}
