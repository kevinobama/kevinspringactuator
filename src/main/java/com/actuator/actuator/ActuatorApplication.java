package com.actuator.actuator;

import com.actuator.actuator.beanclasses.BeanUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ActuatorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ActuatorApplication.class, args);
	}

	@Bean
	public BeanUser kevinBean() {
		return new BeanUser();
	}
}