package com.yehong.library.Service;

import com.yehong.library.dao.BookMapper;
import com.yehong.library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListAllBookService {

    final private BookMapper bookMapper;

    @Autowired
    public ListAllBookService(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public List<Book> selectAllBook() {
        return bookMapper.listAllBook();
    }
}
