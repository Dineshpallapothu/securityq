package com.example.dao;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserDao  {
    private final static List<UserDetails> APPLICATION_USERS = Arrays.asList(
            new User("dinesh@gmail.com", "password", Collections.singleton(new SimpleGrantedAuthority("ADMiN"))),
            new User("pallpothu@gmail.com", "password", Collections.singleton(new SimpleGrantedAuthority("CADMiN")))
    );
    public UserDetails findUserByEmail(String email){

            return APPLICATION_USERS.stream().filter(u -> u.getUsername().equals(email)).findFirst().orElseThrow(() -> new UsernameNotFoundException("NO User Found"));
        }

}
