package com.mydemoapp.springbootmongo.repository;

import com.mydemoapp.springbootmongo.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Author> findAll() {
        return mongoTemplate.findAll(Author.class);
    }
}
