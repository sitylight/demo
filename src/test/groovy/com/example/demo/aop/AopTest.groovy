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
    private AopService aopService

    @Autowired
    private AopAnnotationService annotationService

    def "aopTest"() {
        expect:
        result == aopService.getObjectById(id)

        where:
        id   | result
        "11" | "11"
        "22" | "22"
        "33" | "33"
        "44" | "44"
    }

    def "aopAnnotationTest"() {
        expect:
        result == annotationService.getAnnotationObjectById(id)

        where:
        id   | result
        "11" | "11"
        "22" | "22"
        "33" | "33"
        "44" | "44"
    }
}
