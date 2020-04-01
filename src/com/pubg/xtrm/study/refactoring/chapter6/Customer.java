package com.pubg.xtrm.study.refactoring.chapter6;

import java.util.List;

public class Customer {

    private final String name;
    private final List<Order> orders;

    public Customer(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }

    void printOwing() {
        double outstanding = 0.0;
        printBanner();

        // calculate outstanding
        for (Order e : orders) {
            outstanding += e.getAmount();
        }

        //print details
        System.out.println("name:" + name);
        System.out.println("amount" + outstanding);
    }

    void printBanner() { // print banner
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
    }
}