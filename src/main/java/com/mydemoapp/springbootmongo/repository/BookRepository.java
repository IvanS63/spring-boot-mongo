package com.mydemoapp.springbootmongo.repository;

import com.mydemoapp.springbootmongo.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BookRepository extends MongoRepository<Book, Integer> {
    Optional<Book> findByTitle(String title);
}
