package com.zjq.jpa.dao;

import com.zjq.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {
    @Modifying
    @Transactional
    @Query(value = "insert into sys_User(user_Name) values(?1)", nativeQuery = true)
    int addByUserName(String userName);

    @Modifying
    @Transactional
    @Query("delete from User u where u.userName=?1")
    int deleteUserByName(String userName);

    @Modifying
    @Transactional
    @Query("update User u set u.userName=?1 where u.userId=?2")
    int updateUserNameById(String userName, long userId);

    @Query("select u from User u where u.userName=?1")
    List<User> selectUserByName(String userName);
}
