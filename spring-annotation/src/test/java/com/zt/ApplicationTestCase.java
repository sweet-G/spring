package com.zt;

import com.zt.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhangtian
 * @date 2018/7/17
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class ApplicationTestCase {

    @Autowired
    private UserService userService;

    @Test
    public void testApplication(){
        //ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
       // UserService userService = (UserService) context.getBean("userService");

        userService.save();
    }

}
