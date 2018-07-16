package com.zt.cglib;

import com.zt.proxy.cglib.Sale;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author zhangtian
 * @date 2018/7/16
 */

public class CglibTestCase {

    @Test
    public void testCglid(){

        //创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        //设置目标对象属性
        enhancer.setSuperclass(Sale.class);
        //设置代理类对象的增强功能
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

                System.out.println("-----------------------------");
                Object result = methodProxy.invokeSuper(target,args);
                System.out.println("=============================");

                return result;
            }
        });

        //创建代理类对象
        Sale sale =(Sale) enhancer.create();
        //获取详情对象：getClass()、.class、forName
        System.out.println(sale.getClass().getName());

        sale.proxy();
    }
}
