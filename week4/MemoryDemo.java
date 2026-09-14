package com.oop;

public class MemoryDemo {

    public static void main(String[] args) {


        System.out.println("=== PART 1: Primitives Don't Share ===");
        int balance = 1000;
        int copy = balance;
        copy = 500;

        System.out.println("balance: " + balance);
        System.out.println("copy: " + copy);
        System.out.println();


        System.out.println("=== PART 2: References Do Share ===");
        BankAccount acc1 = new BankAccount("Test", 1000);
        BankAccount acc2 = acc1;          // same object
        acc2.deposit(500);                // change via acc2

        System.out.println("acc1: " + acc1.getBalance()); // 1500
        System.out.println("acc2: " + acc2.getBalance()); // 1500
        System.out.println();


        System.out.println("=== PART 3: Passing Objects vs Primitives ===");
        BankAccount myAccount = new BankAccount("Mine", 500);
        applyBonusToAccount(myAccount);
        System.out.println("myAccount after applyBonusToAccount: "
                + myAccount.getBalance());

        int cash = 500;
        applyBonusToAmount(cash);
        System.out.println("cash after applyBonusToAmount: " + cash);
        System.out.println();


        System.out.println("=== PART 4: Null and NullPointerException ===");
        BankAccount acc3 = null;
        if (acc3 != null) {
            System.out.println("acc3.balance: " + acc3.getBalance());
        } else {
            System.out.println("Account not found (acc3 is null)");
        }
    }

    public static void applyBonusToAccount(BankAccount acc) {
        acc.deposit(100);
    }

    public static void applyBonusToAmount(int amount) {
        amount = amount + 100;
    }
}