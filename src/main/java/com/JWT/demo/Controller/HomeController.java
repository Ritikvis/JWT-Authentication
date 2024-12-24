package com.JWT.demo.Controller;

import com.JWT.demo.Models.User;
import com.JWT.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("home")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("user")
    public List<User> getUser(){
        System.out.print("getting user");
        return this.userService.getUser();
    }
    @GetMapping("currentUser")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
