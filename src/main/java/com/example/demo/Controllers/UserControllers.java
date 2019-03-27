package com.example.demo.Controllers;

import org.apache.maven.model.Model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserControllers {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage() {


        return "home";
    }
}
