// Copyright (c) 2020 Cityline Limited. All rights reserved.

// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-03, derrick, creation
// ============================================================================
package com.example.demo.usecase;

import javax.transaction.Transactional;

@FunctionalInterface
public interface NoOutputUseCase<T> {

    @Transactional(rollbackOn = Exception.class)
    void execute (T object) throws Exception;
}
