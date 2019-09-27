package com.zhang.hystrix.controller;


import com.zhang.hystrix.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    private IUserService userService;

    @RequestMapping("/getUser")
    public String getUser(@RequestParam String username) throws Exception{
        return userService.getUser(username);
    }
}
