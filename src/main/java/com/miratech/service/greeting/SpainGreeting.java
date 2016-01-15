package com.miratech.service.greeting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Primary
public class SpainGreeting implements Greeting {

    public String greet() {
        return "Hola";
    }

    @PostConstruct
    public void init(){
        System.out.println("spainGreeting init");
    }

}
