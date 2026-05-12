package com.example.e_commerce;

import com.example.e_commerce.entity.User;
import com.example.e_commerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User(null, "Priyanka","Gupta","priyanka@gmail.com","Priyanka Gupta"));
        userRepository.save(new User(null, "Anya","Gupta","Anya@gmail.com","Anya Gupta"));
        userRepository.save(new User(null, "Arya","Gupta","Arya@gmail.com","Arya Gupta"));
        userRepository.save(new User(null, "Rakesh","Gupta","Rakesh@gmail.com","Rakesh Ranjan"));

    }
}
