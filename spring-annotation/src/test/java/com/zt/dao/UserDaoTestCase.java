package com.zt.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangtian
 * @date 2018/7/16
 */

public class UserDaoTestCase {

    @Test
    public void testSave(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springAnnotation.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.save();
    }
}
