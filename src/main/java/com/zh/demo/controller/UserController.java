package com.zh.demo.controller;

import com.zh.demo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhu
 * @Class Name UserController
 * @Desc 仅证明能够成功转换为对象
 * @create: 2019-08-07 14:38
 **/
@RestController
public class UserController {
    @PostMapping("/add/user")
    public User addUser(@RequestBody User user) {
        System.out.println(user);
        return user;
    }
}
