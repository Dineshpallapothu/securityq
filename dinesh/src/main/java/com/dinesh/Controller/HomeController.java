package com.dinesh.Controller;

import com.dinesh.Entity.User;
import com.dinesh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getuser(){
        System.out.println("getting usrrs");
        return userService.getusers();
    }

    @GetMapping("/currentuser")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }

    @GetMapping("/hello")
    public String currentUser(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
