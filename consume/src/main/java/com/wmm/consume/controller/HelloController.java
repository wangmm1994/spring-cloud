package com.wmm.consume.controller;

import com.wmm.consume.inter.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloRemote helloRemote;
    @RequestMapping("/hello")
    public String hello(String name){
        return "consu9e:" + helloRemote.hello(name);
    }
}
