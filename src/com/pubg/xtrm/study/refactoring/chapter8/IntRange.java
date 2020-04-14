package com.pubg.xtrm.study.refactoring.chapter8;

public class IntRange {

    int low, high;

    boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

    void grow(int factor) {
        setHigh(getHigh() * factor);
    }

    IntRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    int getLow() {
        return low;
    }

    void setLow(int low) {
        this.low = low;
    }

    int getHigh() {
        return high;
    }

    void setHigh(int high) {
        this.high = high;
    }
}