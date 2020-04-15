package com.pubg.xtrm.study.refactoring.chapter8;

public class Order2 {

    Customer2 customer;

    Customer2 getCustomer() {
        return customer;
    }

    // Customer와 Order는 one to many 관계이므로, Order가 controller 역할을 한다.
    void setCustomer(Customer2 arg) {
        if (customer != null) {
            customer.friendOrders().remove(this);
        }
        customer = arg;
        if (customer != null) {
            customer.friendOrders().add(this);
        }
    }
}
