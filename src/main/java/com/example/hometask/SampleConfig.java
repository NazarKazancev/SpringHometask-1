package com.example.hometask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.hometask")
public class SampleConfig {
    @Bean
    public Sample sample() {
        return new Sample();
    }
}
