// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-03, derrick, creation
// ============================================================================
package com.example.demo.advice;

import com.example.demo.exception.DemoException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author derrick
 */
@RestControllerAdvice
public class DemoExceptionHandler {

    @ExceptionHandler(value = DemoException.class)
    public Map<String, Object> handleDemoException(DemoException ex) {
        return new HashMap<String, Object>(){{
            put("status", ex.getCode());
            put("message", ex.getMessage());
            put("data", new HashMap<>());
        }};

    }
}
