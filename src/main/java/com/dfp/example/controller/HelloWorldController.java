package com.dfp.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping
    @RequestMapping("/")
    public String helloServer() {

        return "hello! .. greetings from server";
    }

}
