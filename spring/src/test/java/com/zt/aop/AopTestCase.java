package com.zt.aop;

import com.zt.proxy.jdk.Lenovo;
import com.zt.proxy.jdk.Sale;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangtian
 * @date 2018/7/16
 */

public class AopTestCase {

    @Test
    public void testAop(){

        ApplicationContext context = new ClassPathXmlApplicationContext("springAop.xml");
        //此时获得的lenovo是增强过后的动态代理类对象，因此不能强转为Lenovo,否则会抛出java.lang.ClassCastException
        Sale sale = (Sale) context.getBean("lenovo");

        System.out.println(sale.getClass().getName());
        sale.save();
    }

}
