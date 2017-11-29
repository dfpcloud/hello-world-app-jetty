package com.dfp.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping
    @RequestMapping("/")
    public String helloServer() {

        return "Hello!! Greetings from DFP. You have successfully deployed your first Spring boot application with DFP cloud platform!\n" +
                "      You can modify the code in this repository to build your app.";
    }

}
