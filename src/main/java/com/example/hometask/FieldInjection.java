package com.example.hometask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection {

    @Autowired
    private Sample sample;

    public Sample getSample() {
        return sample;
    }
}
