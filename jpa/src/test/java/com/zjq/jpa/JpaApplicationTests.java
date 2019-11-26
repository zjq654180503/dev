package com.zjq.jpa;

import com.zjq.jpa.controller.UserController;
import com.zjq.jpa.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class JpaApplicationTests {
    @Autowired
    private UserController userController;
    @Test
    void contextLoads() {
    }

    @Test
    public void testAddUser(){
        User user=new User();
        user.setUserNo("10000");
        user.setUserName("王五");
        user.setPassWord("123");
        user.setUserAge(29);
        user.setUserAddress("陕西省西安市");
        user.setUserSex('男');
        userController.addUser(user);
    }

    @Test
    public void testDeleteUser(){
        User user=new User();
        user.setUserId(1);
        user.setUserNo("10000");
        user.setUserName("张三");
        user.setPassWord("123");
        user.setUserAge(30);
        user.setUserAddress("陕西省西安市");
        user.setUserSex('男');
        userController.deleteUser(user);
    }

    @Test
    public void testUpdateUser(){
        User user=new User();
        user.setUserId(1);
        user.setUserNo("10000");
        user.setUserName("张三1");
        user.setPassWord("123");
        user.setUserAge(30);
        user.setUserAddress("陕西省西安市");
        user.setUserSex('男');
        userController.updateUser(user);
    }

    @Test
    public void testFindAllUser(){
        String jsonStr=userController.findAllUser();
        System.out.println(jsonStr);
    }

    @Test
    public void testFindByUserId(){
        String jsonStr=userController.findById(1L);
        System.out.println(jsonStr);
    }

    @Test
    public void testFindByPage(){
        String jsonStr=userController.findByPage(0,10);
        System.out.println(jsonStr);
    }

    @Test
    public void testAddUserByName(){
        userController.addUserByName("张建清");
    }

    @Test
    public void testDeleteUserByName(){
        userController.deleteUserByName("张建清");
    }

    @Test
    public void testUpdateUserByName(){
        userController.updateUserByName("张建清111",7);
    }

    @Test
    public void testSelectUserByName(){
        String jsonStr=userController.selectUserByName("王五");
        System.out.println(jsonStr);
    }

}
