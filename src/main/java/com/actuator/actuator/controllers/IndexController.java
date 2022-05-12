package com.actuator.actuator.controllers;

import com.actuator.actuator.config.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    User user;

    @GetMapping("/")
    public String index() {

        return "the US";
    }
}
