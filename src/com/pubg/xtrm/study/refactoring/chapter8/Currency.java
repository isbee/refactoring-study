package com.pubg.xtrm.study.refactoring.chapter8;

import java.util.HashMap;
import java.util.Map;

public class Currency {

    private String code;

    public String getCode() {
        return code;
    }

    public Currency(String code) {
        this.code = code;
    }

    public boolean equals(Object currency) {
        if (!(currency instanceof Currency)) {
            return false;
        }
        Currency c = (Currency) currency;
        return code.equals(c.code);
    }

    public int hashCode() {
        return code.hashCode();
    }

    public static void main(String[] args) {
        new Currency("USD").equals(new Currency("USD"));   // true
        Currency c = new Currency("USD");    // value object
    }
}
