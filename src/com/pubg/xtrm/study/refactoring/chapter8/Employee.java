package com.pubg.xtrm.study.refactoring.chapter8;

public class Employee {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer(type);
            default:
                throw new IllegalArgumentException("Invalid employee type");
        }
    }

    Employee() {
    }
}