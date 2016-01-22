package com.miratech.service;

import com.miratech.service.greeting.Greeting;
import com.miratech.service.greeting.LazyBean;
import com.miratech.service.greeting.SpainGreeting;
import com.miratech.service.history.HistoryService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class DefaultSayService implements SayService, BeanNameAware, ApplicationContextAware {

    @Autowired
    private Greeting generator;

    @Autowired
    private HistoryService history;


    @Autowired
    public DefaultSayService(Greeting generator) {
        this.generator = generator;
    }

    public String sayHello(final String name) {
        history.addHistoryItem(this.getClass().getSimpleName() + " : sayHello()");
        return generator.greet() + ", " + name + "!";
    }

    public String sayGoodBye(final String name) {
        history.addHistoryItem(this.getClass().getSimpleName() + " : sayGoodBye()");
        return generator.goodBye() + ", " + name + "!";
    }

    @PostConstruct
    public void init() {
        System.out.println("SayService init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("SayService destroy");
    }

    public void setBeanName(final String s) {
        System.out.println(s);
    }

    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        SpainGreeting greeting = (SpainGreeting) applicationContext.getBean("spainGreeting");
        greeting.greet();

        LazyBean lazyBean = (LazyBean) applicationContext.getBean("lazyBean");
    }



}
