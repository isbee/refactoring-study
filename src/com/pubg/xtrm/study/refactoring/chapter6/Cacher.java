package com.pubg.xtrm.study.refactoring.chapter6;

public class Cacher {

    private final int DUCK = 1;
    private final int PORK = 1;
    private final int CHICKEN = 1;
    private final int BEEF = 1;

    int calculate(int meatType, int weight) throws Exception {
        if (meatType == DUCK) {
            return 240 * weight;
        }
        if (meatType == PORK) {
            return 100 * weight;
        }
        if (meatType == CHICKEN) {
            return 150 * weight;
        }
        if (meatType == BEEF) {
            return 300 * weight;
        }

        throw new Exception("Not supported meatType");
    }
}
