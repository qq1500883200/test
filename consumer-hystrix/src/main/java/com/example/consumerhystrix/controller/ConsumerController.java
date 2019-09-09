package com.example.consumerhystrix.controller;

import com.example.commonbase.BaseUtilApi;
import com.example.consumerhystrix.remote.HelloRemote;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ConsumerController {

    @Autowired
    private HelloRemote helloRemote;
	
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {

        BaseUtilApi.test();

        log.info("{\"short_message\":\""+name+"\", \"host\":\"example.org\", \"facility\":\"test\", \"_foo\":\"bar\"}");
        return helloRemote.hello(name);
    }

    public static void main(String[] args) {
        int a = -10;
        a--;
        System.err.println(a);
    }

}