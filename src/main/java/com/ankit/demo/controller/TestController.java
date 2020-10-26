package com.ankit.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/free/noAuth")
public class TestController {

    @GetMapping("/hi")
    public String noAuth(){
        return "No Authentication Required";
    }
}
