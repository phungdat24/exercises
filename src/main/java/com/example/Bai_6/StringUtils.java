package com.example.Bai_6;

public class StringUtils {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(reversed);
    }
}
