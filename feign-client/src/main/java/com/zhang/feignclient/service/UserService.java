package com.zhang.feignclient.service;

import com.zhang.feignclient.common.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client-one")
public interface UserService {

    @RequestMapping(value="/user/{id}",method = RequestMethod.POST)
    User findUserInfoById(@RequestParam("id")Integer id);
}
