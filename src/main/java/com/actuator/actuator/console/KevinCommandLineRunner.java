package com.actuator.actuator.console;

import com.actuator.actuator.component.ComponentUser;
import com.actuator.actuator.beanclasses.BeanUser;
import com.actuator.actuator.models.Order;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.*;

@Component
public class KevinCommandLineRunner implements CommandLineRunner {

    @Autowired
    private BeanUser user;

    @Autowired
    private ComponentUser componentUser;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("How to use bean and component");
        System.out.println("beans: "+user.getName());

        //ComponentDemo
        System.out.println("component: "+componentUser.getValue());

        System.out.println("StringUtils "+StringUtils.quote("russia"));

        this.beanFactory();
        this.applicationContext();
    }

    public void beanFactory() {
        Resource res = new ClassPathResource("order.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        Order order = (Order) factory.getBean("order");

        System.out.println("order: "+order.getOrderInfo());
        System.out.println("order id: "+order.getOrderId());
    }

    public void applicationContext() {
        System.out.println("============application Context==============");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("order.xml");
        Order order = applicationContext.getBean("order", Order.class);

        System.out.println("order: "+order.getOrderInfo());
        System.out.println("order id: "+order.getOrderId());
    }
}