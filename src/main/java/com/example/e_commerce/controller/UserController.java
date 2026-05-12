package com.example.e_commerce.controller;

import com.example.e_commerce.entity.User;
import com.example.e_commerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/v1/users")
    public List<User> URIVersioningV1(){
        return userService.getAllV1();
    }

    @GetMapping("/v2/users")
    public List<User> URIVersioningV2(){
        return userService.getAllV2();
    }

    @Deprecated
    @GetMapping("/users")
    public List<User> find(){
        return userService.getAllUsers();
    }
}
