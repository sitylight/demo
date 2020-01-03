// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-02, derrick, creation
// ============================================================================
package com.example.demo.controller;

import com.example.demo.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author derrick
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    @PostMapping("/save/user")
    public void saveUser(@RequestBody User user) {

    }
}
