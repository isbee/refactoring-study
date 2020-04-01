package com.pubg.xtrm.study.refactoring.chapter6;

public class Order {

    private int quantity;
    private double itemPrice;

    public double getAmount() {
        return 1.0;
    }

    double getPrice() {
        return basePrice() * discountFactor();
    }

    private double basePrice() {
        return quantity * itemPrice;
    }

    private double discountFactor() {
        if (basePrice() > 1000) return 0.95;
        else return 0.98;
    }
}
