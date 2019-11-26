package com.zjq.jpa.controller;

import com.zjq.jpa.entity.User;
import com.zjq.jpa.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"用户相关接口"})
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "新增用户", notes = "新增用户注意事项", produces = "application/json;charset=UTF-8")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(User user) {
        userService.addUser(user);
    }

    @ApiOperation(value = "修改用户")
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public void updateUser(User user) {
        userService.updateUser(user);
    }

    @ApiOperation(value = "删除用户")
    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public void deleteUser(User user) {
        userService.deleteUser(user);
    }

    @ApiOperation(value = "查询所有用户")
    @RequestMapping(value = "/findAllUser", method = RequestMethod.POST)
    public String findAllUser() {
        List<User> allUser = userService.findAllUser();
        return allUser.toString();
    }

    @ApiOperation(value = "根据用户id查询")
    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    public String findById(Long userId) {
        User user = userService.findByUserId(userId);
        return user.toString();
    }

    @ApiOperation(value = "分页查询")
    @RequestMapping(value = "/findByPage", method = RequestMethod.POST)
    public String findByPage(int page, int size) {
        Page<User> pageUser = userService.findAllUserByPage(page, size);
        List<User> content = pageUser.getContent();
        return content.toString();
    }

    @ApiOperation(value = "根据用户名添加用户")
    @RequestMapping(value = "/addUserByName", method = RequestMethod.POST)
    public void addUserByName(String userName) {
        userService.addUserByName(userName);
    }

    @ApiOperation(value = "根据用户名删除用户")
    @RequestMapping(value = "/deleteUserByName", method = RequestMethod.POST)
    public void deleteUserByName(String userName) {
        userService.deleteUserByName(userName);
    }

    @ApiOperation(value = "根据id修改用户名")
    @RequestMapping(value = "/updateUserNameById", method = RequestMethod.POST)
    public void updateUserByName(String userName, long userId) {
        userService.updateUserByName(userName, userId);
    }

    @ApiOperation(value = "根据用户名查询用户")
    @RequestMapping(value = "/selectUserByName", method = RequestMethod.POST)
    public String selectUserByName(String userName) {
        List<User> usersList = userService.selectUserByName(userName);
        return usersList.toString();
    }
}
