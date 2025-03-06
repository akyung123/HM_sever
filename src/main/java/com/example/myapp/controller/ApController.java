package com.example.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApController {
    
    @GetMapping("/hello")
    public String hello() {
        return "메세지 반환 확인";
    }
}