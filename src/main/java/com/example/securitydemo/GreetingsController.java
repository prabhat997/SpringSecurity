package com.example.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public String greetings() {
        return "Hello World";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "Hello User";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Hello Admin";
    }
}
