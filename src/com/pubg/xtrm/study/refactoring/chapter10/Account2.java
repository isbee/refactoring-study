package com.pubg.xtrm.study.refactoring.chapter10;

public class Account2 {

    private int balance;

    Account2(int balance) {
        this.balance = balance;
    }

    int withdraw(int amount) {
        if (amount > balance) return -1;
        else {
            balance -= amount;
            return 0;
        }
    }

    public static void main(String[] args) {
        Account2 account2 = new Account2(100);
        if (account2.withdraw(200) == -1) {
            // handleOverdrawn();
        } else {
            // doTheUsualThing();
        }
    }
}
