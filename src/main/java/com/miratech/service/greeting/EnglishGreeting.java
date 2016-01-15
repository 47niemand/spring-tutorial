package com.miratech.service.greeting;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@DependsOn("spainGreeting")
@Lazy
public class EnglishGreeting implements Greeting {

    public String greet() {
        return "Hello";
    }

    @PostConstruct
    public void init(){
        System.out.println("englishGreeting init");
    }
}
