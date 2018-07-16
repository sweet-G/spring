package com.zt;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author zhangtian
 * @date 2018/7/16
 */

@Component
@Aspect
public class Aspects {

    @Pointcut("execution(* com.zt..*.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName +"前置");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void after(Object result){
        System.out.println("后置");
        System.out.println("result --> " + result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void exception(Exception exception){
        System.out.println("异常 -->" + exception.getMessage());
    }

    @After("pointCut()")
    public void finallyAdvice(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + "最终都要执行的..");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        Object result = null;

        try {
            System.out.println("---------------");
            proceedingJoinPoint.proceed();
            System.out.println("================");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("*****************");
        } finally {
            System.out.println("$$$$$$$$$$$$$$$$$");
        }
        return result;
    }
}
