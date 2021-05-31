package com.example.hometask;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("interface1")
public class MyInterface1 implements IMyInterface {
    @Override
    public String example() {
        return "FIRST";
    }

    @PostConstruct
    public void created() {
        System.out.println(">>>>> BEAN 1 SUCCESSFULLY CREATED");
    }
}
