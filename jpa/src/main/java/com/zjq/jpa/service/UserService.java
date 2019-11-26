package com.zjq.jpa.service;

import com.zjq.jpa.dao.UserDao;
import com.zjq.jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void addUser(User user) {
        userDao.save(user);
    }

    public void updateUser(User user) {
        userDao.save(user);
    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

    public List<User> findAllUser() {
        return userDao.findAll();
    }

    public User findByUserId(Long userId){
        Optional<User> userOptional = userDao.findById(userId);
        return userOptional.get();
    }

    public Page<User> findAllUserByPage(int page,int size) {
        Sort sort = Sort.by("userId");
        Pageable pageable = PageRequest.of(page, size);
        return userDao.findAll(pageable);
    }

    public void addUserByName(String userName) {
        userDao.addByUserName(userName);
    }

    public void deleteUserByName(String userName) {
        userDao.deleteUserByName(userName);
    }

    public void updateUserByName(String userName,long userId) {
        userDao.updateUserNameById(userName,userId);
    }

    public List<User> selectUserByName(String userName) {
        return userDao.selectUserByName(userName);
    }

}
