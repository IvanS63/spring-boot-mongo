package com.mydemoapp.springbootmongo.integration.book;

import com.mydemoapp.springbootmongo.controller.BookController;
import com.mydemoapp.springbootmongo.dto.BookCreateRequestDTO;
import com.mydemoapp.springbootmongo.integration.AbstractIntegrationTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class BookFlowIntegrationTest extends AbstractIntegrationTest {

    @Test
    public void test_createAndGetBook() throws Exception {

        BookCreateRequestDTO request = objectMapper
                .readValue(new File("src/test/resources/test-data/book-create-request.json"),
                        BookCreateRequestDTO.class);

        mockMvc.perform(post(BookController.BASE_NAME)
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("title").value("Lord of the Rings"));
        Assert.assertEquals(1, bookRepository.findAll().size());
        Assert.assertTrue(bookRepository.findByTitle("Lord of the Rings").isPresent());

        mockMvc.perform(get(BookController.BASE_NAME))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.[0].title").value("Lord of the Rings"));
    }
}
