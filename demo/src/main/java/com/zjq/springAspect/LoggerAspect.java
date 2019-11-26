package com.zjq.springAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 打印日志的切面
 */
@Aspect
@Component
public class LoggerAspect {
    private static final Logger log=LoggerFactory.getLogger(LoggerAspect.class);

    @Around(value="(execution(* com.zjq.service..*.*(..)))")
    public Object service(ProceedingJoinPoint joinPoint){
        Object o=null;
        try {
            String method=joinPoint.getTarget().getClass().getSimpleName()+"."+joinPoint.getSignature();
            log.info(method+" has started!");
            long startTime=System.currentTimeMillis();
            o=joinPoint.proceed();
            long endTime=System.currentTimeMillis();
            long cost=endTime-startTime;
            log.info(method+" already over,cost:"+cost+"(MS)");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return o;
    }
}
