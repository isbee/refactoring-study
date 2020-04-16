package com.pubg.xtrm.study.refactoring.chapter8;

public class Employee2 {
    private EmpolyeeType type;
    private int monthlySalary = 100;
    private int commission = 10;
    private int bonus = 5;

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    Employee2(int type) {
        setType(type);
    }

    // payAmount는 9장 (조건문 단순화) 에서 리팩토링 할 예정
    int payAmount() {
        switch (getType()) {
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

    public int getType() {
        return type.getTypeCode();
    }

    public void setType(int arg) {
        type = EmpolyeeType.setType(arg);
    }
}
