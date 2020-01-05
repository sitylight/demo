// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-02, derrick, creation
// ============================================================================
package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.usecase.user.SaveUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author derrick
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final SaveUseCase saveUseCase;

    @PostMapping("/save/user")
    public void saveUser(@RequestBody final User user) throws Exception {
        saveUseCase.execute(user);
    }
}
