package com.example.cw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw2.Student;


@RestController
public class StudentController {
    @Autowired
    Student student;
    @PostMapping("/students")
    public String postMethodName(@RequestBody Student stu){
        return ("Student name: " + student.getName() + ", age: " + student.getAge());
    }
    @GetMapping("/students")
    public String getMethodName() {
        return new String(student.getName() + " " + student.getAge());
    }

}

