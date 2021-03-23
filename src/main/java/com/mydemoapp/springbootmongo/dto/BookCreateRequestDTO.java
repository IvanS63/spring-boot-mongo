package com.mydemoapp.springbootmongo.dto;

import com.mydemoapp.springbootmongo.entity.Book;
import lombok.Data;

@Data
public class BookCreateRequestDTO {
    private Integer id;
    private String title;

    public Book toBookModel() {
        return Book.builder().id(id).title(title).build();
    }
}
