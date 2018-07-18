package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    UserDao ud;


    @Transactional
    public User saveUser(User user){
        return ud.save(user);
    }

    public Optional<User> findByEmail(String email){
        return ud.findByEmail(email);
    }

    public List<User> validateUser(String email, String password){

        List<User> user=new ArrayList<>();





        return user;
    }
}
