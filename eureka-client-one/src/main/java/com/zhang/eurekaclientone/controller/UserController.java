package com.zhang.eurekaclientone.controller;


import com.zhang.eurekaclientone.common.bean.UserBean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value="/{id}")
    public @ResponseBody UserBean getUserInfoById(@PathVariable(value = "id")Integer id){
        UserBean bean=new UserBean();
        bean.setId(id);
        bean.setName("eureka-client-one");
        bean.setAge(8081);
        bean.setUrl("8081");
        return bean;
    }

    @RequestMapping(value="/list")
    public @ResponseBody
    List<UserBean> getUserInfoById(@RequestBody UserBean bean){
        List<UserBean> list=new ArrayList<>();
        bean.setUrl(bean.getUrl()+"_8081");
        list.add(bean);
        UserBean bean1=new UserBean();
        bean1.setId(8081);
        bean1.setName("eureka-client-one");
        bean1.setAge(8081);
        list.add(bean1);
        return list;
    }

}
