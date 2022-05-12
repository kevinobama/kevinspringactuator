package com.actuator.actuator.console;

//import com.actuator.actuator.component.ComponentDemo;
import com.actuator.actuator.component.ComponentUser;
import com.actuator.actuator.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class KevinCommandLineRunner implements CommandLineRunner {

    @Autowired
    private User user;

    @Autowired
    private ComponentUser componentUser;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("How to use bean and component");
        System.out.println("beans: "+user.getName());

        //ComponentDemo
        System.out.println("component: "+componentUser.getValue());
    }
}