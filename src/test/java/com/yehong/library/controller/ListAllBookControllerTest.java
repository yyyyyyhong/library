package com.yehong.library.controller;

import com.yehong.library.Service.ListAllBookService;
import com.yehong.library.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ListAllBookControllerTest {

    private MockMvc mvc;
    @Autowired
    WebApplicationContext wac;
    ListAllBookController listAllBookController;
    @Test
    void list() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
        RequestBuilder request = get("127.0.0.1:8080/book/list");
        String response = mvc.perform(request).andReturn().getResponse().getContentAsString();
        System.out.println(response);
    }
    @Autowired
    ListAllBookService listAllBookService;
    List<Book> bookList = listAllBookService.selectAllBook();
    @Test
    void bookList() {
        System.out.println(bookList.get(1).getBookName());
    }
}