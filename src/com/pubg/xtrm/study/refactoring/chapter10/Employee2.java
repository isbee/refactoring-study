package com.pubg.xtrm.study.refactoring.chapter10;

class Employee2 {
    private String type;
    static final String ENGINEER = "Engineer";
    static final String SALESMAN = "Salesman";
    static final String MANAGER = "Manager";

    Employee2(String type) {
        type = type;
    }

    static Employee2 create(String name) {
        try {
            return (Employee2) Class.forName(name).newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to initiate");
        }
    }
}