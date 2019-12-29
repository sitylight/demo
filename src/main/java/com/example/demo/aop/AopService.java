// Copyright (c) 2019 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2019-12-26, derrick, creation
// ============================================================================
package com.example.demo.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author derrick
 */
@Service
public class AopService {
    private static Logger logger = LoggerFactory.getLogger(AopService.class);

    public Object getObjectById(String id) {
        logger.debug("executing method getObjectById() with \"" + id + " \"");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return id;
    }
}
