package com.pubg.xtrm.study.refactoring.chapter8;

import java.util.Observable;

public class Interval extends Observable {

    private String start = "0";
    private String end = "0";
    private String length = "0";

    void calculateLength() {
        try {
            int length = Integer.parseInt(getEnd()) - Integer.parseInt(getStart());
            setLength(String.valueOf(length));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Unexpected Number Format Error");
        }
    }

    void calculateEnd() {
        try {
            int end = Integer.parseInt(getStart()) + Integer.parseInt(getLength());
            setEnd(String.valueOf(end));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Unexpected Number Format Error");
        }
    }

    String getStart() {
        return start;
    }

    String getEnd() {
        return end;
    }

    String getLength() {
        return length;
    }

    void setStart (String arg) {
        start = arg;
        setChanged();
        notifyObservers();
    }

    void setLength (String arg) {
        length = arg;
        setChanged();
        notifyObservers();
    }

    void setEnd (String arg) {
        end = arg;
        setChanged();
        notifyObservers();
    }
}
