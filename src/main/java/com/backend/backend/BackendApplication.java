package com.backend.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendApplication {

    @GetMapping
    public String hello() {
        return "Hello, Soton!";
    }

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}
