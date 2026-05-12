package com.example.e_commerce.service;

import com.example.e_commerce.entity.User;
import com.example.e_commerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public List<User> getAllV1() {
        return userRepository.findAll();
    }

    public List<User> getAllV2() {
        return userRepository.findAll();
    }
}
