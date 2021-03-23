package com.mydemoapp.springbootmongo.service;

import com.mydemoapp.springbootmongo.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();

    Optional<Book> findByTitle(String title);

    Book create(Book book);
}
