package com.pubg.xtrm.study.refactoring.chapter8;

import java.util.HashSet;
import java.util.Set;

public class Customer2 {
    private Set<Order2> orders = new HashSet<>();

    Set<Order2> friendOrders() {
        /** should only be used by Order when modifying the association */
        return orders;
    }

    void addOrder(Order2 arg) {
        arg.addCustomer(this);
    }

    void removeOrder(Order2 arg) {
        arg.removeCustomer(this);
    }
}
