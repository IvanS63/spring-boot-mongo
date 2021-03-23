package com.mydemoapp.springbootmongo.service.impl;

import com.mydemoapp.springbootmongo.entity.Author;
import com.mydemoapp.springbootmongo.repository.AuthorRepository;
import com.mydemoapp.springbootmongo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(final AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}
