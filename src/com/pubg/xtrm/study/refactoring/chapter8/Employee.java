package com.pubg.xtrm.study.refactoring.chapter8;

public class Employee {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private int type;

    public Employee(int type) {
        type = type;
    }
}