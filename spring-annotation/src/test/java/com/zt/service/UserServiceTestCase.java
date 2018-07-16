package com.zt.service;

import com.zt.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangtian
 * @date 2018/7/16
 */

public class UserServiceTestCase {

    @Test
    public void testUserService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springAnnotation.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.save();
    }
}
