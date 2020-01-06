// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-06, derrick, creation
// ============================================================================
package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author derrick
 */
public interface UserDetailService {
    UserDetails loadUserByName(String username);
}
