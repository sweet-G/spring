package com.zt.controller;

import com.zt.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhangtian
 * @date 2018/7/20
 */

@Controller
@RequestMapping("/user")
public class UserController {

  /*  @GetMapping("/add")
    public String add(){
        return "user/add";
    }*/

   /* @GetMapping("/{id:\\d+")
    public String find(@PathVariable Integer id, Model model){
        model.addAttribute("id",id);
        System.out.println("id: " + id);
        return "user/home";
    }*/

    @GetMapping("/{id:\\d+}")
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
    public String addUser(User user){
        System.out.println("username: " + user.getUsername());
        System.out.println("address: "+ user.getAddress());
        return "redirect:/user/home";
    }
}
