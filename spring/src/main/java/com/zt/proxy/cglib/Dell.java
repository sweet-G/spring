package com.zt.proxy.cglib;

/**
 * @author zhangtian
 * @date 2018/7/16
 */

public class Dell extends Sale{

    @Override
    public void proxy(){
        System.out.println("售前");
        super.proxy();
        System.out.println("售后");
    }

}
