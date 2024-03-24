package com.backend.backend.service;

import com.backend.backend.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> findAllUser();
}
