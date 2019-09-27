package com.zhang.ribbon.controller;

import com.zhang.ribbon.common.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/list")
    public @ResponseBody
    Object getUserInfoById(@RequestBody User bean) {
        bean.setUrl(bean.getUrl() + "_8083");
        return restTemplate.postForObject("http://eureka-client-one/user/list", bean, List.class);
    }

}
