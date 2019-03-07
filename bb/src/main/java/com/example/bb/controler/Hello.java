package com.example.bb.controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {


        @PostMapping("/reg2")
        @ResponseBody
        public Object reg(){
            /*v5.0*/
            return "123";

        }
}
