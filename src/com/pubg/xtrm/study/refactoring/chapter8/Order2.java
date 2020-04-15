package com.pubg.xtrm.study.refactoring.chapter8;

import java.util.HashSet;
import java.util.Set;

public class Order2 {

    Set<Customer2> customers = new HashSet<>();

    Set<Customer2> getCustomers() {
        return customers;
    }

    /**
     * 예시에서는 Order가 controller 역할을 하지만,
     * Customer와 Order가 many to many 관계이므로 Customer가 controller 여도 무관하다.
     * */
    void addCustomer(Customer2 arg) {
        arg.friendOrders().add(this);
        customers.add(arg);
    }

    void removeCustomer(Customer2 arg) {
        arg.friendOrders().remove(this);
        customers.remove(arg);
    }
}
