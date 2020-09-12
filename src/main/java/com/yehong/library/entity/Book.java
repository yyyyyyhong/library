package com.yehong.library.entity;

import lombok.Data;

@Data
public class Book {
    private int bookNum;
    private BookType bookType;
    private String bookName;
    private String author;
    private boolean borrowStatus;
    private int borrowerId;
}
