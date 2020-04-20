package com.pubg.xtrm.study.refactoring.chapter10;

import java.util.Date;

public class DateRange {

    private final Date start = null;
    private final Date end = null;

    DateRange(Date start, Date end) {
        start = start;
        end = end;
    }

    boolean includes(Date arg) {
        return arg.equals(start) || arg.equals(end) || (arg.after(start) && arg.before(end));
    }

    Date getStart() {
        return start;
    }

    Date getEnd() {
        return end;
    }
}
