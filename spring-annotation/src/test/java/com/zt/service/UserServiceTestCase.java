package com.zt.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhangtian
 * @date 2018/7/16
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springAnnotation.xml")
public class UserServiceTestCase {

    @Autowired
    private UserService userService;

    @Test
    public void testUserService(){
       // ApplicationContext context = new ClassPathXmlApplicationContext("springAnnotation.xml");
        //UserService userService = (UserService) context.getBean("userService");
        userService.save();
    }
}
