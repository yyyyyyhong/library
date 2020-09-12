package com.yehong.library.Service;

import com.yehong.library.dao.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class BorrowBooksTest {

    @Autowired
    BorrowBookService borrowBooks;
    @Test
    void borrowBooks() {

        borrowBooks.borrowBooks(1, 2);
    }
}