package com.example.hometask;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class HometaskApplication {
    private static FieldInjection fieldInjection;
    private static IMyInterface myInterface;
    private static ConstructorInjection constructorInjection;
    private static SetterInjection setterInjection;

    public HometaskApplication(FieldInjection fieldInjection, @Qualifier("interface1") IMyInterface myInterface,
                               ConstructorInjection constructorInjection, SetterInjection setterInjection) {
        HometaskApplication.fieldInjection = fieldInjection;
        HometaskApplication.myInterface = myInterface;
        HometaskApplication.constructorInjection = constructorInjection;
        HometaskApplication.setterInjection = setterInjection;
    }

    public static void main(String[] args) {
        SpringApplication.run(HometaskApplication.class, args);
        System.out.println(myInterface.example());
        System.out.println(fieldInjection.getSample().Hello());
        System.out.println(constructorInjection.getSample().World());
        System.out.println(setterInjection.getExample().Spring());
    }
}
