package com.example.Bai_3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);
    public int add(int a, int b){
        int r = a+b;
        logger.info("add {} + {} = {} ", a, b, r);
        return r;
    }
}
