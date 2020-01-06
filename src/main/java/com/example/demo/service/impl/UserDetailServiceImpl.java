// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-06, derrick, creation
// ============================================================================
package com.example.demo.service.impl;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.UserDetailService;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author derrick
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserDetailServiceImpl implements UserDetailService {
    private final UserService userService;

    @Override
    public UserDetails loadUserByName(final String username) {
        final Optional<User> userOptional = userService.getUserByName(username);
        if (userOptional.isPresent()) {
            final List<GrantedAuthority> authorities = new ArrayList<>();
            final List<Role> roles = userOptional.get().getRoles();
        }
        return null;
    }
}
