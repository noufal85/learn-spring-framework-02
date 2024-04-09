package com.noufal.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class BusinessCalculationService {
    private DataService dataservice;

    public BusinessCalculationService(DataService dataservice) {
        super();
        this.dataservice = dataservice;
    }
    public int findMax() {
        return Arrays.stream(dataservice.retrieveAllData()).max().orElse(0);
    }
}
