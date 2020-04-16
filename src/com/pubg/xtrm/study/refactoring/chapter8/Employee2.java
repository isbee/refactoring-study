package com.pubg.xtrm.study.refactoring.chapter8;

public class Employee2 {
    private int _type;
    private int monthlySalary = 100;
    private int commission = 10;
    private int bonus = 5;

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    Employee2(int type) {
        _type = type;
    }

    int payAmount() {
        switch (_type) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
