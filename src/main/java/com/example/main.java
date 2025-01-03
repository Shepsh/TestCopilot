package com.example;

import java.util.Collections;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

@RestController
class MyController {
    @GetMapping("/")
    public Map<String, String> readRoot() {
        return Collections.singletonMap("message", "Hello, world!");
    }

    @GetMapping("/square/{number}")
    public Map<String, Integer> square(@PathVariable int number) {
        return Collections.singletonMap("square", number * number);
    }
}