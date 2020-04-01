package com.pubg.xtrm.study.refactoring.chapter6;

public class Gamma {

    private final Account account;
    private final int inputVal;
    private final int quantity;
    private final int yearToDate;

    public Gamma(Account source, int inputValArg, int quantityArg, int yearToDateArg) {
        account = source;
        inputVal = inputValArg;
        quantity = quantityArg;
        yearToDate = yearToDateArg;
    }

    int compute() {
        int importantValue1 = (inputVal * quantity) + account.delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        return importantValue3 - 2 * importantValue1;
    }
}
