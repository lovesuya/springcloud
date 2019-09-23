package com.zhang.feignclient.controller;


import com.zhang.feignclient.common.bean.User;
import com.zhang.feignclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value="/list")
    public @ResponseBody
    List<User> getUserInfoById(@RequestBody User bean){

        return userService.getUserList(bean);
    }

}
