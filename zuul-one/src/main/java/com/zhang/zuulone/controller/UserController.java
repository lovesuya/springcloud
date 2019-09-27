package com.zhang.zuulone.controller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {



    @RequestMapping(value="/list")
    public @ResponseBody String
     getUserInfoById(@PathVariable Integer id){
        return id+"";
    }

}
