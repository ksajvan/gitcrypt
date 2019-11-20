package com.example.gitcrypt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello From App";

    @Value("${app.title}")
    private String appTitle;

    @Value("${test.username}")
    private String username;

    @Value("${test.password}")
    private String password;

    @GetMapping("/test")
    public String greeting() {
        return template;
    }

    @GetMapping("/title")
    public String getTitleFromProperties() {
        return appTitle;
    }

    @GetMapping("/user")
    public String getUserPassFromProperties() {
        return "Username: " + username + " with password: " + password;
    }
}
