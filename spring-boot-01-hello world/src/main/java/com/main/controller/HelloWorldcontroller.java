package com.main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldcontroller {

    @RequestMapping("/hello")
    @ResponseBody
    public  String  hello(){
        return "HelloWorld";
    }

}
