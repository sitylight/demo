// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-03, derrick, creation
// ============================================================================
package com.example.demo.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author derrick
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DemoException extends Exception{
    private int code;
    private String message;

    public DemoException(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
