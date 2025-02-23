package com.example.demo.javase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("")
    public String index() {
        return System.getProperty("java.version") + " is running.";
    }
}