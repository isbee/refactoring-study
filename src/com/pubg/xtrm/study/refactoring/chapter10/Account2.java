package com.pubg.xtrm.study.refactoring.chapter10;

public class Account2 {

    private int balance;

    Account2(int balance) {
        this.balance = balance;
    }

    void withdraw(int amount) {
        if (!canWithdraw(amount)) {
            // handleOverdrawn();

            // IllegalArgumentException은 RuntimeException의 하위 클래스이므로
            // unchecked exception 이다.
            throw new IllegalArgumentException("Amount too large");
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        Account2 account2 = new Account2(100);
        int amount = 200;
        account2.withdraw(amount);
        // doTheUsualThing();
    }

    boolean canWithdraw(int amount) {
        if (amount > balance) {
            return false;
        }
        return true;
    }
}
