package com.miratech.service.greeting;

import org.springframework.stereotype.Component;

@Component
public class SpainGreeting implements Greeting {

    public String greet() {
        return "Hola";
    }

}
