package com.pubg.xtrm.study.refactoring.chapter10;

public class Account2 {

    private int balance;

    Account2(int balance) {
        this.balance = balance;
    }

    void withdraw(int amount) throws BalanceException {
        if (!canWithdraw(amount)) {
            // BalanceException은 Exception의 하위 클래스이므로
            // 컴파일 단계에서 확인되는 checked exception 이다.
            throw new BalanceException();
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        Account2 account2 = new Account2(100);
        int amount = 200;
        try {
            account2.withdraw(amount);
            // doTheUsualThing();
        } catch (BalanceException e) {
            // handleOverdrawn();
        }
    }

    boolean canWithdraw(int amount) {
        if (amount > balance) {
            return false;
        }
        return true;
    }
}
