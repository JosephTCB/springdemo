package com.spring.demo.dao;

import com.spring.demo.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lichujun on 2018-05-26.
 */
@Repository
public interface UserDao {
    public int saveUser(User user);
    public List<User> queryAll();
}
