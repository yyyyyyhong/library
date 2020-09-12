package com.yehong.library.Service;

import com.yehong.library.dao.UserMapper;
import com.yehong.library.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/*lombok的@RequiredArgsConstructor可以帮助自动建立构造器注入*/
@Service
@RequiredArgsConstructor
public class UpdatePersonInformationService {
    private final  UserMapper userMapper;


//    @Autowired
//    public UpdatePersonInformationService(UserMapper userMapper){
//        this.userMapper=userMapper;
//    }

    public boolean updatePersonInformation(User user) {
        if (userMapper.isExist(user.getUserName())) {
            return false;
        } else {
            userMapper.updateUser(user);
            return true;
        }

    }


}
