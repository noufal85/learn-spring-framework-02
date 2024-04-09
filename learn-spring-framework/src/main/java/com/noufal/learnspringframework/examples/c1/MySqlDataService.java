package com.noufal.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;

@Component

public class MySqlDataService implements  DataService{
    @Override
    public int[] retrieveAllData() {
            return new int[] {1,2,3,4,5,6,7,8,9,10};
    //    return null;
        }

}
