package com.zt.test;

import com.zt.service.BaseService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * @author zhangtian
 * @date 2018/7/14
 */

public class BaseServiceTestCase {

    @Test
    public void testBase(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BaseService baseService = (BaseService) context.getBean("baseService");

        System.out.println(baseService.getId());
        System.out.println(baseService.getName());
        System.out.println(baseService.getScore());

        List<String> stringList = baseService.getStringList();
        for(String str : stringList){
            System.out.println(str);
        }

        Set<Integer> sets = baseService.getNumSet();
        for(Integer num : sets){
            System.out.println(num);
        }

        Map<String ,String> maps = baseService.getMaps();
        for(Map.Entry<String ,String> entry :maps.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Properties properties = baseService.getProperties();
        Enumeration<Object> keys =  properties.keys();

        while(keys.hasMoreElements()){
            Object key = keys.nextElement();
            Object value = properties.get(key);

            System.out.println(key);
            System.out.println(value);
        }

    }


}
