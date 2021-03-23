package com.mydemoapp.springbootmongo.service.impl;

import com.mydemoapp.springbootmongo.entity.Book;
import com.mydemoapp.springbootmongo.repository.BookRepository;
import com.mydemoapp.springbootmongo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private final BookRepository bookRepository;

    public BookServiceImpl(final BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findByTitle(final String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }
}
