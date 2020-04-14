package com.pubg.xtrm.study.refactoring.chapter8;

import java.util.HashMap;
import java.util.Map;

public class Currency {

    private static Map<String, Currency> currencyList = new HashMap<>(){
        {
            put("USD", new Currency("USD"));
            put("KRW", new Currency("KRW"));
        }
    };
    private String code;

    public String getCode() {
        return code;
    }

    private Currency(String code) {
        this.code = code;
    }

    public static Currency getCurrencyByCode(String code) {
        return currencyList.get(code);
    }

    public static void main(String[] args) {
        new Currency("USD").equals(new Currency("USD"));   // false
        Currency c = getCurrencyByCode("USD");   // reference object
    }
}
