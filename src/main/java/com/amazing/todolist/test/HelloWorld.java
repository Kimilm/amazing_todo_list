package com.amazing.todolist.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    
    @RequestMapping("/test")
    public String test(){
        return "Hello World!!";
    }
}
