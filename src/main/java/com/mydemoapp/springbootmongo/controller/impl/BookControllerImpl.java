package com.mydemoapp.springbootmongo.controller.impl;

import com.mydemoapp.springbootmongo.controller.BookController;
import com.mydemoapp.springbootmongo.dto.BookCreateRequestDTO;
import com.mydemoapp.springbootmongo.entity.Book;
import com.mydemoapp.springbootmongo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookControllerImpl implements BookController {

    @Autowired
    private final BookService bookService;

    public BookControllerImpl(final BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public ResponseEntity<List<Book>> list() {
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> create(BookCreateRequestDTO bookCreateRequestDTO) {
        return new ResponseEntity<>(bookService.create(bookCreateRequestDTO.toBookModel()), HttpStatus.CREATED);
    }
}
