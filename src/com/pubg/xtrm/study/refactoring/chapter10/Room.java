package com.pubg.xtrm.study.refactoring.chapter10;

public class Room {

    boolean withinPlan(HeatingPlan plan) {
        int low = daysTempRange().getLow();
        int high = daysTempRange().getHigh();
        return plan.withinRange(low, high);
    }

    TempRange daysTempRange() {
        return new TempRange();
    }
}
