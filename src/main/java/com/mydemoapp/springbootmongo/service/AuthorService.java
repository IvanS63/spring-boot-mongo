package com.mydemoapp.springbootmongo.service;


import com.mydemoapp.springbootmongo.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();
}
