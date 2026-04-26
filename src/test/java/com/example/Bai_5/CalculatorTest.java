package com.example.Bai_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, cal.add(2, 3));
    }
}
