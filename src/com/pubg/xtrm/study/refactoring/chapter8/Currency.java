package com.pubg.xtrm.study.refactoring.chapter8;

public class Currency {

    private String code;

    public String getCode() {
        return code;
    }

    private Currency(String code) {
        this.code = code;
    }

    public static void main(String[] args) {
        new Currency("USD").equals(new Currency("USD"));   // false
    }
}
