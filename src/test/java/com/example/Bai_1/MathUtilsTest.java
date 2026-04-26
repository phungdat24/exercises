package com.example.Bai_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    void testAdd(){
        MathUtils m = new MathUtils();
        assertEquals(5, m.add(2,3));
    }
}
