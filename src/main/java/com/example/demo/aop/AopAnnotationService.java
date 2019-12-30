package com.example.demo.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author derrick.liang 2019/12/29
 */

@Service
@AopAnnotation
public class AopAnnotationService {
    private static Logger logger = LoggerFactory.getLogger(AopAnnotationService.class);

    public Object getAnnotationObjectById(String id) {
        logger.debug("executing method getAnnotationObjectById() with \"" + id + " \"");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return id;
    }
}
