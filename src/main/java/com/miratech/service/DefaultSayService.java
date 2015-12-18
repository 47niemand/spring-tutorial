package com.miratech.service;

import com.miratech.service.greeting.EnglishGreeting;
import com.miratech.service.greeting.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultSayService implements SayService {


    private Greeting generator;

    @Autowired
    public DefaultSayService(EnglishGreeting generator) {
        this.generator = generator;
    }

    public String sayHello(final String name) {
        return generator.greet() + ", " + name + "!";
    }

}
