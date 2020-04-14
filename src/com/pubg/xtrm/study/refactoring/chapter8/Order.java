package com.pubg.xtrm.study.refactoring.chapter8;

public class Order {

    private Customer customer;

    public Order(String customerName) {
        this.customer = Customer.getNamedCustomer(customerName);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(String customerName) {
        customer = Customer.getNamedCustomer(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }
}
