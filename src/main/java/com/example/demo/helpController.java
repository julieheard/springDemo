package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helpController {

    @GetMapping("/help")
    public String help(){
        return "help";
    }
}
