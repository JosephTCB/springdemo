package com.spring.demo.service;

import com.spring.demo.bean.User;

import java.util.List;

/**
 * Created by lichujun on 2018-05-26.
 */
public interface UserService {
    public int saveUser(User user);
    public List<User> queryAll();
}
