package com.zhang.hystrix.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhang.hystrix.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    @HystrixCommand(fallbackMethod = "defaultUser")
    public String getUser(String username) throws Exception{
        if("spring".equals(username)){
            return "this is real user";
        }else{
            throw new Exception();
        }
    }

    @Override
    public String defaultUser(String username) {
        return "this is does not exist in this system";
    }
}
