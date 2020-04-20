package com.pubg.xtrm.study.refactoring.chapter10;

public class HeatingPlan {

    private TempRange range;

    boolean withinRange (TempRange roomRange) {
        return range.includes(roomRange);
    }
}
