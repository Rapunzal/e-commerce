package com.example.e_commerce.repository;


import com.example.e_commerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {



}
