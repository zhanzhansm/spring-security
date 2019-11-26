package com.hero.cat.controller;


import com.fasterxml.jackson.annotation.JsonView;
import com.hero.cat.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController("/user")
public class UserController {

    @RequestMapping("/test1")
    @ResponseBody
    public Object test1(){
        System.out.println("test1 ---> do");
        return "abc";
    }


    @GetMapping("/{id:\\d+}")
    public User getInfo(@PathVariable String id) {
		throw new RuntimeException("user not exist");
//        System.out.println("进入getInfo服务");
//        User user = new User();
//        user.setUsername("tom");
//        return user;
    }




}
