package com.yehong.library.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class LogInServiceTest {
    @Autowired
    LogInService logInService;

    @Test
    void logIn() {
        System.out.println(logInService.logIn("yehong", "987456"));
    }
}