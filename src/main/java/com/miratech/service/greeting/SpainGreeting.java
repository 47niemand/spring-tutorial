package com.miratech.service.greeting;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SpainGreeting implements Greeting {

    public String greet() {
        return "Hola";
    }

    public String goodBye() {
        return "Good Bye!";
    }

    @PostConstruct
    public void init(){
        System.out.println("spainGreeting init");
    }

}
