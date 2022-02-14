package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    //Hello is the name of the webpage resource
    //http://localhost:8080/hello
    //http://localhost:8080/hello?name=Julie
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        return String.format("Hello %s", name);
    }

    //Default value is used if the data is invalid
    //http://localhost:8080/test?name=coding
    @GetMapping ("/test")
    public String test(@RequestParam (value = "projectName", defaultValue = "Playing with Spring Boot") String name){
        return String.format("Project name is : %s", name);
    }
}
