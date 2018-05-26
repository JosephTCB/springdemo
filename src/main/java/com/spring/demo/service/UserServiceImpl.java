package com.spring.demo.service;

import com.spring.demo.bean.User;
import com.spring.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lichujun on 2018-05-26.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    public int saveUser(User user){
        return userDao.saveUser(user);
    }

    public List<User> queryAll(){
        return userDao.queryAll();
    }

}
