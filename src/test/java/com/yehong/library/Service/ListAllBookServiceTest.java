package com.yehong.library.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ListAllBookServiceTest {

    @Autowired
    ListAllBookService listAllBookService;
    @Test
    void selectAllBook() {
       System.out.println(listAllBookService.selectAllBook().size() );
    }
}