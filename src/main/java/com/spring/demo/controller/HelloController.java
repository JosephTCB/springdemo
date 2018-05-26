package com.spring.demo.controller;

import com.alibaba.fastjson.JSON;
import com.spring.demo.bean.User;
import com.spring.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by lichujun on 2018-05-26.
 */
@Controller
public class HelloController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/hello")
    public String hello(){
        User user = new User();
        user.setId(1);
        user.setName("joseph");
        userService.saveUser(user);
        List<User> list = userService.queryAll();
        System.out.println(JSON.toJSONString(list));
        return "hello";
    }
}
