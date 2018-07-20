package com.zt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhangtian
 * @date 2018/7/19
 */

@org.springframework.stereotype.Controller
public class HelloController {

    //@RequestMapping(value = "/hello", method = {RequestMethod.POST,RequestMethod.GET})
    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello springMVC");
        return "hello";
    }
}
