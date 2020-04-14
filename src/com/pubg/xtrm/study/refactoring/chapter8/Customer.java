package com.pubg.xtrm.study.refactoring.chapter8;

import java.util.HashMap;

public class Customer {

    private static HashMap<String, Customer> instances = new HashMap<>();
    private final String name;

    private Customer(String name) {
        this.name = name;
    }

    public static Customer getNamedCustomer(String name) {
        return instances.get(name);
    }

    // (예시용 코드) Customer를 필요할 때 생성하거나, DB에서 가져오는 대신, 미리 생성해둔다.
    static void loadCustomers() {
        new Customer ("Lemon Car Hire").store();
        new Customer ("Associated Coffee Machines").store();
        new Customer ("Bilston Gasworks").store();
    }

    private void store() {
        instances.put(this.getName(), this);
    }

    public String getName() {
        return name;
    }
}
