package com.miratech.service.greeting;

import org.springframework.stereotype.Component;

@Component
public class EnglishGreeting implements Greeting {

    public String greet() {
        return "Hello";
    }

}
