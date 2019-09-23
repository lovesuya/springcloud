package com.zhang.feignclient.controller;


import com.zhang.feignclient.common.bean.User;
import com.zhang.feignclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/{id}")
    public @ResponseBody
    User getUserInfoById(@PathVariable(value = "id")Integer id){

        return userService.findUserInfoById(id);
    }

}
