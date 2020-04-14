package com.pubg.xtrm.study.refactoring.chapter8;

public class IntRange {

    int low, high;

    boolean includes(int arg) {
        return arg >= low && arg <= high;
    }

    void grow(int factor) {
        high = high * factor;
    }

    IntRange(int low, int high) {
        this.low = low;
        this.high = high;
    }
}