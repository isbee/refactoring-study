package com.pubg.xtrm.study.refactoring.chapter10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    double getFlowBetween(Date start, Date end) {
        double result = 0;
        for (Entry e : entries) {
            if (e.getDate().equals(start) ||
                    e.getDate().equals(end) || (e.getDate().after(start) &&
                    e.getDate().before(end))) {
                result += e.getValue();
            }
        }
        return result;
    }

    private List<Entry> entries = new ArrayList<>();

    // client code
//    double flow = account.getFlowBetween(startDate, endDate);
}
