package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// Aspect separating the cross-cutting logging concern from business logic (Exercise 8)
@Aspect
public class LoggingAspect {

    // Advice method: logs before method execution
    @Before("execution(* com.library.service.*.*(..))")
    public void logBefore() {
        System.out.println("LoggingAspect: Before method execution...");
    }

    // Advice method: logs after method execution
    @After("execution(* com.library.service.*.*(..))")
    public void logAfter() {
        System.out.println("LoggingAspect: After method execution.");
    }
}
