package com.example.hometask;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Sample {

    public Sample() {}

    @PostConstruct
    public void created() {
        System.out.println(">>>> BEAN SUCCESSFULLY CREATED");
    }

    @PreDestroy
    public void destroyed() {
        System.out.println(">>>>>> BEAN WILL BE DESTROYED NOW");
    }

    public String Hello() {
        return "Hello";
    }

    public String World() {
        return "World";
    }

    public String Spring() {
        return "Spring";
    }
}
