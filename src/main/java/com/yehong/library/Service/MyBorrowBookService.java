package com.yehong.library.Service;
import com.yehong.library.dao.BookMapper;
import com.yehong.library.entity.Book;
import com.yehong.library.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MyBorrowBookService {

    private final BookMapper bookMapper;

    @Autowired
    public MyBorrowBookService(BookMapper bookMapper){
        this.bookMapper = bookMapper;
    }

    public List<Book> listMyBorrowBook(User user){
        return bookMapper.selectBookByUser(user.getId());
    }
}
