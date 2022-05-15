package com.actuator.actuator;

import com.actuator.actuator.beanclasses.BeanUser;
import com.actuator.actuator.component.ComponentUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class ActuatorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ActuatorApplication.class, args);
		System.out.println(applicationContext.getEnvironment());;

		ComponentUser componentUser = applicationContext.getBean(ComponentUser.class);
		System.out.println("fetch from application context:"+componentUser.getValue());
	}

	@Bean
	@Scope("prototype")
	public BeanUser kevinBean() {
		return new BeanUser();
	}
}