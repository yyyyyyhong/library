package com.yehong.library.Service;

import com.yehong.library.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogInService {


    private final UserMapper userMapper;
    @Autowired
    public LogInService(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    public boolean logIn(String userName, String passwd){
        return userMapper.logIn(userName, passwd);
    }

}
