package com.pubg.xtrm.study.refactoring.chapter8;

import java.util.List;

public class Client {

    private static int numberOfOrdersFor(List<Order> orders, String customer) {
        int result = 0;
        for (Order o : orders) {
            if (o.getCustomer().equals(customer)) result++;
        }
        return result;
    }
}
