package com.noufal.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinesClass {
    @Autowired
    Dependency1 dependency1;
    @Autowired
    Dependency2 dependency2;

    public String toString() {
        return "YourBusinessClass using " + dependency1 + " and " + dependency2;
    }

}
@Component
class Dependency1 {

}
@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncher {


    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(DepInjectionLauncher.class)
                ) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinesClass.class));

        }

    }
}
