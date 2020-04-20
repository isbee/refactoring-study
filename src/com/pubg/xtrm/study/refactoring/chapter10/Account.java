package com.pubg.xtrm.study.refactoring.chapter10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    double getFlowBetween(DateRange range) {
        double result = 0;
        for (Entry e : entries) {
            if (range.includes(e.getDate())) {
                result += e.getValue();
            }
        }
        return result;
    }

    private List<Entry> entries = new ArrayList<>();

    // client code
//    double flow = account.getFlowBetween(new DateRange(startDate, endDate));
}
