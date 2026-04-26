package com.example.Bai_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    void testSub() {
        assertEquals(1, cal.sub(3, 2));
    }

    @Test
    void testMul() {
        assertEquals(6, cal.mul(2, 3));
    }

    @Test
    void testDiv() {
        assertEquals(2, cal.div(6, 3));
    }
}
