package com.actuator.actuator.console;

import com.actuator.actuator.models.Order;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class KevinCommandLineRunnerTest {

    @Test
    void beanFactory() {

    }

    @Test
    void applicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("order.xml");

        Order order = (Order) context.getBean("order");
        assertEquals(order.getOrderId(), "8888");
    }
}