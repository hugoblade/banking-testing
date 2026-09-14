package com.oop;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Jacob", 1000000);

        try {
            b1.deposit(-100);
            System.out.println("Deposited. New balance: " + b1.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Deposit rejected: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt logged.");
        }
    }
}