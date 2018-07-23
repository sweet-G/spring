package com.zt.controller;

import com.zt.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangtian
 * @date 2018/7/20
 */

@Controller
//@ResponseBody// 返回值是string只返回字符串，不跳转
@RequestMapping("/user")
public class UserController {

    @GetMapping("/add")
    public String add(@CookieValue(name = "username") String name, Model model ){

        model.addAttribute("name",name);
        return "user/add";
    }

   /* @GetMapping("/{id:\\d+")
    public String find(@PathVariable Integer id, Model model){
        model.addAttribute("id",id);
        System.out.println("id: " + id);
        return "user/home";
    }*/
    //获得url中文乱码时的问题
    //@GetMapping(value = "/{type:v-.}/{id:\\d+}",produces = "text/plain;charset=UTF-8")
    @RequestMapping(value = "/{id:\\d+}",method = {RequestMethod.POST})
    public ModelAndView find(
            @RequestParam(defaultValue = "1")Integer p,
            @PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("user/home");
        //modelAndView.setViewName("user/home");
        modelAndView.addObject("id",id);
        System.out.println("id: "+ id);
        System.out.println("p: "+ p);
        return modelAndView;
    }

    @GetMapping("/home")
    public String page(@RequestParam(value = "p",defaultValue = "1")Integer p){
        System.out.println("p: "+ p);
        return "user/home";
    }

   /* @PostMapping("/add")
    public String addUser(String username,String address){
        System.out.println("username: "+ username);
        System.out.println("address: " + address);
        return "redirect:/user/list";
    }*/

    @PostMapping("/add")
    public String addUser(User user, HttpServletRequest rq, HttpServletResponse resp, HttpSession session){

        // cookie存值
        Cookie cookie = new Cookie("username",user.getUsername());
        cookie.setDomain("localhost");
        cookie.setMaxAge(60 * 60 * 24);
        cookie.setPath("/");
        cookie.setHttpOnly(true);

        resp.addCookie(cookie);

        System.out.println("username: " + user.getUsername());
        System.out.println("address: "+ user.getAddress());
        return "redirect:/user/home";
    }

    @GetMapping("/list")
    public List<User> batchSave(){
        //将string转为list
        List<User> userList = Arrays.asList(
                new User("rose","bj"),
                new User("jack","hk"),
                new User("alex", "sh")
        );
        return userList;
    }


}
