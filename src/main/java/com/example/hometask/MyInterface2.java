package com.example.hometask;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("interface2")
public class MyInterface2 implements IMyInterface {
    @Override
    public String example() {
        return "SECOND";
    }

    @PostConstruct
    public void created() {
        System.out.println(">>>>> BEAN 2 SUCCESSFULLY CREATED");
    }
}
