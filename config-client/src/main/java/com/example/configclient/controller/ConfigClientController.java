package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RefreshScope
@RestController
public class ConfigClientController {


    @Value("${server.version}")
    private String version;


    @RequestMapping("/version")
    public String sayHi(){


        //刷新配置
        //http://localhost:8882/refresh
        //restTemplate.postForObject("http://localhost:8882/refresh",null,String.class);

        return version;
    }
}
