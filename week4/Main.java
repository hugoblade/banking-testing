package com.oop;

public class Main {
    public static void main(String[] args) {

        BankAccount jacobsAccount = new BankAccount();
        BankAccount useAccount = new BankAccount();

        jacobsAccount.accountHolder = "Jacob";
        jacobsAccount.balance = 100.0;

        System.out.println("Before deposit: " + jacobsAccount.balance);

        jacobsAccount.deposit(100.0);


        System.out.println("After deposit: " + jacobsAccount.balance);

        System.out.println("useAccount's balance: " + useAccount.balance);

        useAccount.accountHolder = "Alice";
        useAccount.deposit(50.0);
        System.out.println(useAccount.accountHolder + "'s balance: " + useAccount.balance);
    }
}