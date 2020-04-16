package com.pubg.xtrm.study.refactoring.chapter8;

public abstract class EmpolyeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    abstract int getTypeCode();

    static EmpolyeeType setType(int code) {
        switch (code) {
            case ENGINEER:
                return new Engineer2();
            case MANAGER:
                return new Manager();
            default:
                throw new RuntimeException("Incorrect Employee Code");
        }
    }
}
