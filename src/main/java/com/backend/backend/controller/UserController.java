package com.backend.backend.controller;

import com.backend.backend.model.User;
import com.backend.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String addUser(@RequestBody User user) {
        System.out.println(user);
        userService.saveUser(user);
        return "New user has been created.";
    }

    @GetMapping("getAll")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }
}
