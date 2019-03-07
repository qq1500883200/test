package com.example.aa.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2 {


        @GetMapping("/reg2")
        @ResponseBody
        public Object reg(){

            return "reg2";

        }
}
