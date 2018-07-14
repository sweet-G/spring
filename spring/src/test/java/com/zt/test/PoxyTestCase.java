package com.zt.test;

import com.zt.proxy.Lenovo;
import com.zt.proxy.MyInvocationHandler;
import com.zt.proxy.Sale;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @author zhangtian
 * @date 2018/7/14
 */

public class PoxyTestCase {

    @Test
    public void testPoxy(){
        Lenovo lenovo = new Lenovo();

        //创建MyInvocationHandler对象
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(lenovo);

        //动态产生代理类对象
        Sale sale = (Sale) Proxy.newProxyInstance(
                Lenovo.class.getClassLoader(),
                Lenovo.class.getInterfaces(),
                myInvocationHandler);

        sale.save();
    }


}
