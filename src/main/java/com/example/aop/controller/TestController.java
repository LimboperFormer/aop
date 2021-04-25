package com.example.aop.controller;

import com.example.aop.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee
 * @version 1.0
 * @date 2021/1/26
 */

@RestController
public class TestController {


    @GetMapping("/ad")
    public User testMethod() {

        User user = new User();
        user.setIdNo("123456789123456789");
        user.setUsername("zhangsna");
        user.setEmail("123456789@qq.com");
        user.setName("张先生");
        user.setPassword("123456");

        return user;
    }
}
