// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-02, derrick, creation
// ============================================================================
package com.example.demo.usecase;

/**
 * @author derrick
 */
@FunctionalInterface
public interface UseCase<U, T> {
    U execute(T object) throws Exception;
}
