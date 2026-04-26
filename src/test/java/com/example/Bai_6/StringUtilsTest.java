package com.example.Bai_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    StringUtils util = new StringUtils();
    @Test
    void testPalindrome(){
        assertTrue(util.isPalindrome("Levels"));
    }
    @Test
    void testNotPalindrome() {
        assertFalse(util.isPalindrome("Hello"));
    }

}
