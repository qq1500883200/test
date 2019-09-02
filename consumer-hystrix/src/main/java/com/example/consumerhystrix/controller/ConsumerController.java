package com.example.consumerhystrix.controller;

import com.example.commonbase.BaseUtilApi;
import com.example.consumerhystrix.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private HelloRemote helloRemote;
	
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {

        BaseUtilApi.test();
        return helloRemote.hello(name);
    }

}