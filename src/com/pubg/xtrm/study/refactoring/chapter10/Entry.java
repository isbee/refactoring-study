package com.pubg.xtrm.study.refactoring.chapter10;

import java.util.Date;

public class Entry {

    private Date chargeDate;
    private double value;

    Entry(double value, Date chargeDate) {
        this.value = value;
        this.chargeDate = chargeDate;
    }

    Date getDate() {
        return chargeDate;
    }

    double getValue() {
        return value;
    }
}
