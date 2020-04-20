package com.pubg.xtrm.study.refactoring.chapter10;

public class TempRange {

    private int low = 1;
    private int high = 3;

    boolean includes(TempRange arg) {
        return arg.getLow() >= this.getLow() && arg.getLow() <= this.getHigh();
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }
}
