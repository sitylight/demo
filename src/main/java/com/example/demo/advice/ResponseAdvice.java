// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-03, derrick, creation
// ============================================================================
package com.example.demo.advice;

import com.example.demo.usecase.UseCase;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author derrick
 */
@RestControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object value, MethodParameter methodParameter, MediaType mediaType, Class aClass,
            ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        return new HashMap<String, Object>() {{
            put("status", 200);
            if (value != null) {
                put("data", value);
            } else {
                put("data", new HashMap<>());
            }

        }};
    }
}
