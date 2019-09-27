package com.zhang.ribbon.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfiguration {


   /* @Autowired
    IClientConfig config;*/

    /*public IRule ribbonRule(IClientConfig config){
        return new RandomRule();
    }*/

    public IRule ribbonRule() {
        return new RandomRule();
    }


}
