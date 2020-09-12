package com.yehong.library.Service;

import com.yehong.library.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowBookService {

    /*构造器注入保证被初始化*/
    private final BookMapper bookMapper;
    @Autowired
    public BorrowBookService (BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
//不推荐变量注入的方式
//    @Autowired
//    private BookMapper bookMapper;

    public boolean borrowBooks(int bookNum, int borrowerId){
        return bookMapper.lendBook(bookNum, borrowerId);
    }
}
