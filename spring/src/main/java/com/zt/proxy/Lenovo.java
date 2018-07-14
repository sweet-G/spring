package com.zt.proxy;

/**
 * @author zhangtian
 * @date 2018/7/14
 */

public class Lenovo implements Sale{

    @Override
    public void save() {
        System.out.println("销售电脑一台");
    }
}
