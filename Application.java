package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/")
    public String home() {
        return "SUCCESS 🚀 Spring Boot running via Jenkins + Docker on EC2!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
