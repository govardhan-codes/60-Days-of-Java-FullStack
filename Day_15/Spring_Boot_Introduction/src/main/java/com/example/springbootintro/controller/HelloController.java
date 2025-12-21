package com.example.springbootintro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to Spring Boot!";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot Controller";
    }
}
