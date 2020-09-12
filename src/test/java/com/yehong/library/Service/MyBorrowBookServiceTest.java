package com.yehong.library.Service;

import com.yehong.library.entity.Book;
import com.yehong.library.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyBorrowBookServiceTest {
    @Autowired
    MyBorrowBookService myBorrowBookService;
    @Test
    void listMyBorrowBook() {
        /*在外部环境下要用Spring来管理对象，但在方法内只能用new了*/
        User user = new User();
        user.setId(1);
        List<Book> list = myBorrowBookService.listMyBorrowBook(user);
    }
}