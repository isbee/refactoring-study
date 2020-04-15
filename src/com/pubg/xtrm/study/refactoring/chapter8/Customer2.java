package com.pubg.xtrm.study.refactoring.chapter8;

import java.util.HashSet;
import java.util.Set;

public class Customer2 {
    private Set<Order2> orders = new HashSet<>();

    Set<Order2> friendOrders() {
        /** should only be used by Order when modifying the association */
        return orders;
    }

    // Customer도 control에 관여하고 싶은 경우
//    void addOrder(Order2 arg) {
//        arg.setCustomer(this);
//    }
}
