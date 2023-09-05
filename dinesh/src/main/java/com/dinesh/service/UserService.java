package com.dinesh.service;

import com.dinesh.Entity.User;
import com.dinesh.repo.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private Userrepo userrepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    private List<User> store =new ArrayList<>();

//    public UserService(){
//        store.add(new User(UUID.randomUUID().toString(),"dinesh","dineshpallapothu@gmail"));
//        store.add(new User(UUID.randomUUID().toString(),"kumar","kumar@gmail"));
//        store.add(new User(UUID.randomUUID().toString(),"praveen","praveen@gmail"));
//    }
    public List<User> getusers(){
        return userrepo.findAll();
    }

    public User create(User user){
        user.setUserid(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userrepo.save(user);
    }



}
