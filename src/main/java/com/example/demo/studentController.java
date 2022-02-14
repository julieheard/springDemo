package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {


    //http://localhost:8080/getStudent?name=Julie
    @GetMapping("/getStudent")
    public Student getStudent(@RequestParam (value = "studentName") String studentName){
        return new Student (studentName, "TempID");
    }


    //http://localhost:8080/getStudentID?name=Julie&ClassCode=UCSA
    @GetMapping("/getStudentID")
    public Student getStudent(@RequestParam(value = "studentName") String name, @RequestParam(value = "classCode")String classCode){
        return new Student(name, classCode);
    }

    @PostMapping("/makeStudent")
    public Student createStudent(@RequestParam(value = "studentName") String name, @RequestParam(value = "classCode")String classCode){
        return new Student(name, classCode);
    }


}

