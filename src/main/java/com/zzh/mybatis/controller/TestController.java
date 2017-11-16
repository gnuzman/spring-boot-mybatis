package com.zzh.mybatis.controller;

import com.zzh.mybatis.entity.User;
import com.zzh.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("test")
    public String test() {
        User user = new User();
        user.setName("test");
        userMapper.addUser(user);
        return "test";
    }
}
