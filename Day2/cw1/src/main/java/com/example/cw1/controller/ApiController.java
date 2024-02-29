package com.example.cw1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw1.model.AppConfig;


@RestController
@Service
public class ApiController {
    @Autowired
    AppConfig app;
    @GetMapping("/info")
    public String getMethodName() {
        return new String("App Name: "+app.getAppName() + ", Version: " + app.getAppVersion());
    }
}
