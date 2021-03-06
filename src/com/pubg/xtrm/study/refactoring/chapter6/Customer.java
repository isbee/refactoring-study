package com.pubg.xtrm.study.refactoring.chapter6;

import java.util.List;

public class Customer {

    private final String name;
    private final List<Order> orders;

    public Customer(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }

    void printOwing(double previousAmount) {
        printBanner();
        double outstanding = getOutstanding(previousAmount * 1.2);
        printDetails(outstanding);
    }


    void printBanner() { // print banner
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
    }

    double getOutstanding(double outstanding) {
        for (Order o : orders) {
            outstanding += o.getAmount();
        }
        return outstanding;
    }

    void printDetails(double outstanding) {
        System.out.println("name:" + name);
        System.out.println("amount" + outstanding);
    }
}