package com.mydemoapp.springbootmongo.controller;

import com.mydemoapp.springbootmongo.dto.BookCreateRequestDTO;
import com.mydemoapp.springbootmongo.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(BookController.BASE_NAME)
public interface BookController {
    String MAJOR_VERSION = "/v1";
    String BASE_NAME = MAJOR_VERSION + "/books";

    @GetMapping
    ResponseEntity<List<Book>> list();

    @PostMapping
    ResponseEntity<Book> create(@RequestBody BookCreateRequestDTO bookCreateRequestDTO);
}
