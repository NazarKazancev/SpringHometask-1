package com.example.hometask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {
    private Sample example;

    @Autowired
    public void setExample(Sample example) {
        this.example = example;
    }

    public Sample getExample() {
        return example;
    }
}
