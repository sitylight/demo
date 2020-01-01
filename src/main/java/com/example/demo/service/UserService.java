package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

/**
 * @author derrick.liang 2019/12/31
 */
public interface UserService {
    Optional<User> getUserById(String id);

    List<User> getAllUsers();

    void newOrUpdateUser(User user);

 }
