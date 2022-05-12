package com.actuator.actuator.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentUser {
    public String getValue() {
        return "This java component";
    }
}