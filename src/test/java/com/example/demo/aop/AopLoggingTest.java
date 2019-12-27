// Copyright (c) 2019 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2019-12-27, derrick, creation
// ============================================================================
package com.example.demo.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author derrick
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AopLoggingTest {
    @Autowired
    private AopService aopService;

    @Test
    public void TestGetObjectById() {
        aopService.getObjectById("1111");
    }
}
