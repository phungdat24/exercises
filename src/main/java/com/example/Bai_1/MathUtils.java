package com.example.Bai_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);
    public int add(int a, int b){
        int result = a+b;
        logger.info("add{}, {}) = {}", a, b, result);
        return result;
    }
}
