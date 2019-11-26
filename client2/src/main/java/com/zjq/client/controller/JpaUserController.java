package com.zjq.client.controller;

import com.zjq.client.JpaServiceRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaUserController {
    @Autowired
    private JpaServiceRemote jpaServiceRemote;

    @RequestMapping(value = "/findAllUser")
    public String findAllUser() {
        String className=jpaServiceRemote.getClass().getSimpleName();
        System.out.println("client2:"+className);
        return jpaServiceRemote.findAllUser();
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello2";
    }

    @RequestMapping(value = "/foos")
    public String foo(String foo) {
        return "Filter AddRequestParameter client2"+foo;
    }

    @RequestMapping(value = "/zjq/test")
    public String test(String foo) {
        return "2ddddddd"+foo;
    }


}
