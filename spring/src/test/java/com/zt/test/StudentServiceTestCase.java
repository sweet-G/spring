package com.zt.test;

import com.zt.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangtian
 * @date 2018/7/14
 */

public class StudentServiceTestCase {

    @Test
    public void testSave(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.save();
    }

}
