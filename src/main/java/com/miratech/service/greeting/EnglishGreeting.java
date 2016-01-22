package com.miratech.service.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@DependsOn("spainGreeting")
@Lazy
@Primary
public class EnglishGreeting implements Greeting {

    @Value("${greeting.english}")
    private String greet;

    public String greet() {
        return greet;
    }

    public String goodBye() {
        return "Bye!";
    }

    @PostConstruct
    public void init(){
        System.out.println("englishGreeting init");
    }
}
