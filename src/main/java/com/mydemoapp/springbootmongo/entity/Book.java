package com.mydemoapp.springbootmongo.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@Data
@Builder
public class Book {
    @Id
    private Integer id;
    @Field(name = "title")
    private String title;
}
