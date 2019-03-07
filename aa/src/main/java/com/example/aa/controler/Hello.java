package com.example.aa.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {


        @GetMapping("/reg")
        @ResponseBody
        public Object reg(){
            /* v1.0*/
            return "this is a yubo";

        }
}
