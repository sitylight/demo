// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-03, derrick, creation
// ============================================================================
package com.example.demo.exception;

import lombok.Data;

/**
 * @author derrick
 */
public enum ErrorCode {
    INNER_ERROR(500, "code error");

    private int code;
    private String message;
    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": [" + code + ", " +  message + "]";
    }
}
