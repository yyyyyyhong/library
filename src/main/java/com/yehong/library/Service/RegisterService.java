package com.yehong.library.Service;

import com.yehong.library.dao.UserMapper;
import com.yehong.library.entity.User;
import com.yehong.library.entity.registerStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    private final UserMapper userMapper;

    @Autowired
    public RegisterService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public registerStatus register(String userName, String passwd){
        if (userMapper.isExist(userName)){
            return registerStatus.REPETITIVE;
        }
        else{
            User newUser = new User();
            newUser.setUserName(userName);
            newUser.setPasswd(passwd);
            userMapper.updateUser(newUser);
            return registerStatus.SUCCEED;
        }
    }
}

