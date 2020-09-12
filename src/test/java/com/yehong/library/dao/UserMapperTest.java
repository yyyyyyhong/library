package com.yehong.library.dao;

import com.yehong.library.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserMapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    void getUserByID() {
    }

    @Test
    void insertUser() {
        User user = new User();
        user.setUserName("zhangsan");
        user.setPasswd("123457");
        userMapper.insertUser(user);
        System.out.println(user.getId());
    }
    @Test
    void isExist(){
        System.out.println(userMapper.isExist("zhangsan"));
        System.out.println(userMapper.isExist("lisi"));
    }
    @Test
    void getPasswdByName(){
        System.out.println(userMapper.getPasswdByName("zengyehong"));
    }

    @Test
    void updateUser(){
        User user = new User();
        user.setId(1);
        user.setPasswd("987456");
        user.setUserName("yehong");
        userMapper.updateUser(user);
    }


}