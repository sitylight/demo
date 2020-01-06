// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-06, derrick, creation
// ============================================================================
package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.model.UserDetail;
import com.example.demo.service.CustomUserDetailsService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author derrick
 */
@Component
public class CustomUserDetailsServiceImpl implements CustomUserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        final Optional<User> userOptional = userService.getUserByName(username);
        final UserDetail userDetail = new UserDetail();
        if (userOptional.isPresent()) {
            final User user = userOptional.get();
            userDetail.setId(user.getId());
            userDetail.setUsername(user.getName());
            userDetail.setPassword(user.getPassword());
            userDetail.setAuthorities(user.getRoles());
        }
        return userDetail;
    }
}
