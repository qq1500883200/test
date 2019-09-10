package com.example.producer2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String index(@RequestParam String name) throws Exception {

        //Thread.sleep(10000);
        String result = "hello "+name+"，this is first messge：9002";
        System.err.println(result);
        return result;
    }
}