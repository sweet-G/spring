package com.zt.proxy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author zhangtian
 * @date 2018/7/16
 */

public class AopAspects {

    public void beforeAdvice(JoinPoint joinPoint) {
        //获得方法名
        String methodName = joinPoint.getSignature().getName();
        //获得参数列表
        Object[] objs = joinPoint.getArgs();
        //获得目标对象
        Object object = joinPoint.getTarget();

        System.out.println("前置通知");
    }
    public void afterAdvice(Object result) {
        System.out.println("后置通知");
        System.out.println("result --> " + result);

    }
    public void exceptionAdvice(Exception exception) {
        System.out.println("异常通知 --> " + exception.getMessage());
    }
    public void finallyAdvice() {
        System.out.println("最终通知");
    }

    public Object aroundAdvice(ProceedingJoinPoint joinPoint){

        Object result = null;
        try {
            System.out.println("exception before");
            //目标对象执行方法
            result = joinPoint.proceed();
            System.out.println("exception after");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("exception catch");
        } finally {
            System.out.println("exception finally");
        }

        return result;

    }

}
