package com.example.hometask;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {
    private Sample sample;

    public ConstructorInjection(Sample sample) {
        this.sample = sample;
    }

    public Sample getSample() {
        return sample;
    }
}
