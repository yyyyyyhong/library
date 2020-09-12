package com.yehong.library.dao;

import com.yehong.library.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM `book` WHERE book_num= #{bookNum};")
    Book getBookById(int bookNum);

    //借还图书
    @Update("UPDATE `library`.`book` SET `borrow_status` = b'1', `borrower_id` = #{borrowerId} WHERE `book_num` = #{bookNum}")
    boolean lendBook(@Param("bookNum") int bookNum, @Param("borrowerId") int borrowerId);

    @Update("UPDATE `library`.`book` SET `borrow_status` = b'0', `borrower_id` = null WHERE `book_num` = #{bookNum}")
    boolean returnBook(int bookNum);

    //浏览书库
    @Select("SELECT * FROM book")
    List<Book> listAllBook();

    //查询图书，模糊查询
    @Select("SELECT * FROM book WHERE book_name LIKE '%${keyWord}%' ")
    List<Book> selectBook(String keyWord);

    //查询某人的借书
    @Select("SELECT * FROM book WHERE borrower_id = #{id}")
    List<Book> selectBookByUser(int id);
}
