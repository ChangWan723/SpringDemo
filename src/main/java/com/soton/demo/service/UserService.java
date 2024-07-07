package com.soton.demo.service;

import com.soton.demo.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> findAllUser();
}
