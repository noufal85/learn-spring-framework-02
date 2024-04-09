package com.noufal.learnspringframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SimpleSpringDepeInjection {


    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(SimpleSpringDepeInjection.class)
                ) {

        }

    }
}
