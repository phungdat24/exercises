package com.example.Bai_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger logger= LoggerFactory.getLogger(BankAccount.class);
    private  String owner;
    private double balance;
    public BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance = balance;
        logger.info("Created bank account for {} with balance {}", owner, balance);
    }
    public void deposit(double amount){
        logger.info("Depositing {} to {}", amount, owner);
        this.balance += amount;
        logger.info("New balance for {} = {}", owner, balance);
    }
    public double getBalance() {
        return this.balance;
    }
}
