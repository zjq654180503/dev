package com.zjq.service;

import com.zjq.entity.User;
import com.zjq.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> listUser(){
        return userDao.listUser();
    }
}
