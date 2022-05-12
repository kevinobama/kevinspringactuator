package com.actuator.actuator.controllers;

import com.actuator.actuator.beanclasses.BeanUser;
import com.actuator.actuator.component.ComponentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

@RestController
public class IndexController {

    @Autowired
    private BeanUser user;

    @Autowired
    private ComponentUser componentUser;

    @GetMapping("/")
    public HashMap<String,String> index() {
        HashMap<String,String> data = new HashMap<>();
        data.put("bean", user.getName());
        data.put("component", componentUser.getValue());

        return data;
    }
}