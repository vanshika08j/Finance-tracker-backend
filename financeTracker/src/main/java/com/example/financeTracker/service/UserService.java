package com.example.financeTracker.service;

import com.example.financeTracker.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();

}
