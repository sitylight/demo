// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-03, derrick, creation
// ============================================================================
package com.example.demo.advice;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.HashMap;

/**
 * @author derrick
 */
@RestControllerAdvice
public class DemoResponseAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(final MethodParameter methodParameter, final Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(final Object value, final MethodParameter methodParameter, final MediaType mediaType, final Class aClass,
            final ServerHttpRequest serverHttpRequest, final ServerHttpResponse serverHttpResponse) {
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
