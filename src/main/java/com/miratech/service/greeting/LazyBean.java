package com.miratech.service.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Profile("lazy")
@Component
@Lazy
public class LazyBean {

    @Autowired
    SpainGreeting greeting;

    @PostConstruct
    public void init(){
        System.out.println("lazyBean init");
    }

}
