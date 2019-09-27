package com.zhang.feignclient.service;

import com.zhang.feignclient.common.bean.User;
import com.zhang.feignclient.service.impl.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "eureka-client-one",fallback = UserServiceFallback.class)
public interface UserService {

    @RequestMapping(value="/user/{id}",method = RequestMethod.POST)
    User findUserInfoById(@RequestParam("id")Integer id);
    @RequestMapping(value="/user/list",method = RequestMethod.POST)
    List<User> getUserList(@RequestBody User bean);
}
