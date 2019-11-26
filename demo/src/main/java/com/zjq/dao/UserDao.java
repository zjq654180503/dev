package com.zjq.dao;

import com.zjq.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserDao {
    List<User> listUser();
}
