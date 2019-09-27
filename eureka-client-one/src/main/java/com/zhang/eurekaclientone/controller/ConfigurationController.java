package com.zhang.eurekaclientone.controller;


import com.zhang.eurekaclientone.common.bean.ConfigInfoPropertiesRefresh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    @Autowired
    private ConfigInfoPropertiesRefresh configInfoPropertiesRefresh;

    @RequestMapping("/getConfigInfo")
    private String getConfigInfo(){
        return configInfoPropertiesRefresh.getConfig();
    }
}
