package com.zt.proxy.aop;

/**
 * @author zhangtian
 * @date 2018/7/16
 */

public class AopAspects {

    public void beforeAdvice() {
        System.out.println("前置通知");
    }
    public void afterAdvice() {
        System.out.println("后置通知");
    }
    public void exceptionAdvice() {
        System.out.println("异常通知");
    }
    public void finallyAdvice() {
        System.out.println("最终通知");
    }
}
