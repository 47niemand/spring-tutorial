package com.miratech;

import com.miratech.configuration.ApplicationConfig;
import com.miratech.service.DefaultSayService;
import com.miratech.service.SayService;
import com.miratech.service.history.DefaultHistoryService;
import com.miratech.service.history.HistoryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();


    private static void initContext() {
        context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("lazy");
        context.register(ApplicationConfig.class);
        context.refresh();

    }

    public static void main(String[] args) {
        initContext();

        SayService say = context.getBean(DefaultSayService.class);
        HistoryService historyService = context.getBean(DefaultHistoryService.class);


        System.out.println(say.sayHello("Roman"));
        System.out.println(say.sayGoodBye("Roman"));
        System.out.println(say.sayHello("Roman"));
        System.out.println(say.sayGoodBye("Roman"));
        System.out.println(say.sayGoodBye("Roman"));


        historyService.printHistory();

        context.registerShutdownHook();
    }
}
