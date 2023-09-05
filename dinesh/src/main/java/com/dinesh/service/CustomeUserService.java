package com.dinesh.service;

import com.dinesh.Entity.User;
import com.dinesh.repo.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomeUserService implements UserDetailsService {
    @Autowired
    private Userrepo userrepo;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //load user from database
        User user = userrepo.findByEmail(username).orElseThrow(() -> new RuntimeException("userName NOt Found"));

        return user;
    }
}
