package com.yehong.library.dao;

import com.yehong.library.dao.BookMapper;
import com.yehong.library.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class BookMapperTest {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testSelect() {
        Book book = bookMapper.getBookById(1);
        System.out.println(book.getBookName());
        System.out.println(book.getBookType());
        System.out.println(book.getBookNum());

    }
    @Test
    void lendTest(){
        bookMapper.lendBook(1, 2);
    }
    @Test
    void returnBook(){
        bookMapper.returnBook(1);
    }

    @Test
    void listAllBook(){
        List<Book> allBooks = bookMapper.listAllBook();
        for(Book i : allBooks){
            System.out.println(i.getBookName());
        }
    }

    @Test
    void selectBook(){
        List<Book> selBooks = bookMapper.selectBook("大");
        for(Book i : selBooks){
            System.out.println(i.getBookName());
        }
    }
}
