package com.pubg.xtrm.study.refactoring.chapter6;

public class Order {

    private int quantity;
    private double itemPrice;

    public double getAmount() {
        return 1.0;
    }

    double getPrice() {
        double basePrice = quantity * itemPrice;
        double discountFactor;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}
