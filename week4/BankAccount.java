package com.oop;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException(
                    "Opening balance cannot be negative, got: " + openingBalance);
        }
        this.accountHolder = accountHolder;
        this.balance = openingBalance;
    }

    public BankAccount(String accountHolder) {
        this(accountHolder, 0);
    }

    public BankAccount() {
        this("Unknown");
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit must be positive, got: " + amount);
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal must be positive, got: " + amount);
        }
        if (amount > this.balance) {
            throw new IllegalArgumentException(
                    "Insufficient funds: tried to withdraw " + amount
                            + " but balance is " + this.balance);
        }
        this.balance -= amount;
    }

    private boolean isValidAmount(double amount) {
        return amount > 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void getAccountDetails() {
        System.out.println(accountHolder + ", balance = " + balance);
    }
}