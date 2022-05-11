package com.tima.springboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello tanhj";
    }

    @GetMapping("/name")
    public String name(@RequestParam(value = "name", defaultValue = "tanhj") String name){
        return String.format("Hello %s!",name);
    }
}
