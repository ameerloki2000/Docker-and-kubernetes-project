package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        return List.of(
                new User(1, "Ameer"),
                new User(2, "John"),
                new User(3, "Sara")
        );
    }

    @GetMapping("/")
    public String home() {
        return "Java Spring Boot App Running!";
    }
}

