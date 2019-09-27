package com.zhang.feignclient.service.impl;

import com.zhang.feignclient.common.bean.User;
import com.zhang.feignclient.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceFallback  implements UserService {


    @Override
    public User findUserInfoById(Integer id) {
        User bean=new User();
        bean.setId(8082);
        bean.setName("error");
        return bean;
    }

    @Override
    public List<User> getUserList(User bean) {
        List list=new ArrayList();
        bean.setId(8082);
        bean.setName("error");
        list.add(bean);
        return list;
    }
}
