package com.pubg.xtrm.study.refactoring.chapter6;

import java.util.HashMap;
import java.util.Map;

public class Cacher {

    private final int DUCK = 1;
    private final int PORK = 1;
    private final int CHICKEN = 1;
    private final int BEEF = 1;

    int calculate(int meatType, int weight) throws Exception {
        Map<Integer, Integer> meats = new HashMap<Integer, Integer>() {
            {
                put(DUCK, 240);
                put(PORK, 100);
                put(CHICKEN, 240);
                put(BEEF, 240);
            }
        };
        if (meats.containsKey(meatType)) {
            return meats.get(meatType) * weight;
        }

        throw new Exception("Not supported meatType");
    }
}
