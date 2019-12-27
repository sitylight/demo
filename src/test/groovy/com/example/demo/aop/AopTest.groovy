// Copyright (c) 2019 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2019-12-27, derrick, creation
// ============================================================================
package com.example.demo.aop

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification;
/**
 * @author derrick*
 */
@SpringBootTest
class AopTest extends Specification {
    @Autowired
    private AopService aopService;

    def "aopTest"() {
        expect:
        result == aopService.getObjectById(id)

        where:
        id      |   result
        "11"    |   "11"
        "22"    |   "22"
        "33"    |   "33"
        "44"    |   "44"
    }
}
