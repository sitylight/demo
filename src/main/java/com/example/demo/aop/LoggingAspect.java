// Copyright (c) 2019 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2019-12-26, derrick, creation
// ============================================================================
package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * @author derrick
 */
@Aspect
@Component
public class LoggingAspect {
    private static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("@annotation(com.example.demo.aop.AopAnnotation)")
    private void aopAnnotationLog() {}

    @Order(-99)  // small priority
    @Around("execution(* com.example.demo.aop..*(..))) and !aopAnnotationLog()")
    public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return methodProceed(proceedingJoinPoint);
    }

    @Around("aopAnnotationLog()")
    public Object profileAnnotationMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return methodProceed(proceedingJoinPoint);
    }

    private Object methodProceed(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        logger.info("start to execute [" + className + "." + methodName + "()]");
        Object result = proceedingJoinPoint.proceed();
        stopWatch.stop();
        logger.info(
                "Execution time of [" + className + "." + methodName + "()]" + " is " + stopWatch.getTotalTimeMillis()
                        + " ms");
        return result;
    }
}
