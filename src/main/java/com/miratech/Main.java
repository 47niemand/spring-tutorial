package com.miratech;

import com.miratech.configuration.ApplicationConfig;
import com.miratech.service.DefaultSayService;
import com.miratech.service.SayService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        SayService say = context.getBean(DefaultSayService.class);
        String greeting = say.sayHello("Roman");

        System.out.println(greeting);

        context.registerShutdownHook();
    }
}
