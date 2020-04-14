package com.pubg.xtrm.study.refactoring.chapter8;


public class CappedRange extends IntRange {

    private int cap;

    CappedRange(int low, int high, int cap) {
        super(low, high);
        this.cap = cap;
    }

    int cappedHigh() {
        return Math.min(high, cap);
    }
}
