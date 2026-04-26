package com.example.Bai_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    void depositIncreasesBalance() {
        BankAccount acc = new BankAccount("Alice", 100.0);
        acc.deposit(50.0);
        assertEquals(150.0, acc.getBalance());
    }
}
