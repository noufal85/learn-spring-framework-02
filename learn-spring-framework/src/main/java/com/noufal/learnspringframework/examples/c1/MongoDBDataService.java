package com.noufal.learnspringframework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements  DataService{
    @Override
    public int[] retrieveAllData() {
            return new int[] {5, 89, 100};
    //    return null;
        }

}
