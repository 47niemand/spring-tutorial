package com.miratech.service.greeting;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy
public class LazyBean {

    @PostConstruct
    public void init(){
        System.out.println("lazyBean init");
    }

}
