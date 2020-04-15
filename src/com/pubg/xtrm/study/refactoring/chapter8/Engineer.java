package com.pubg.xtrm.study.refactoring.chapter8;

public class Engineer extends Employee {

    Engineer() {
        super();
    }

    public static Employee create(int type) {
        if (type == ENGINEER) {
            return new Engineer();
        }
        return create(type);
    }

    public int getType() {
        return Employee.ENGINEER;
    }
}
