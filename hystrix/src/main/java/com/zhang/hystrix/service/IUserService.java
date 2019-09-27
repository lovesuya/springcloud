package com.zhang.hystrix.service;

public interface IUserService {

    public String getUser(String username) throws Exception;

    public String defaultUser(String username);
}
