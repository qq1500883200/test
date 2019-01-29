package com.example.aa.controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {


        @PostMapping("/reg")
        @ResponseBody
        public Object reg(){

            return "123";

        }
}
