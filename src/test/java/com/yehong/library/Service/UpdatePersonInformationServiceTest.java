package com.yehong.library.Service;

import com.yehong.library.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UpdatePersonInformationServiceTest {

    @Autowired
    UpdatePersonInformationService updatePersonInformationService;

    @Test
    @Transactional
    @Rollback//用于回滚数据
    void updatePersonInformation() {
        User user = new User();
        user.setPasswd("123654");
        user.setUserName("王五");
        user.setId(3);
        updatePersonInformationService.updatePersonInformation(user );
    }
}