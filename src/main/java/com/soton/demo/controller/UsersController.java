package com.soton.demo.controller;

import com.soton.demo.model.User;
import com.soton.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UsersController {
    @Autowired
    private UserService userService;

    @PostMapping("signup")
    public ResponseEntity<ApiResponse> addUser(@RequestBody User user) {
        userService.saveUser(user);
        String message = "New user has been created.";
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(message));
    }

    @GetMapping("getAll")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }
}
