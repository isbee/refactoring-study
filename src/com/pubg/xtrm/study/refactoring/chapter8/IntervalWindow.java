package com.pubg.xtrm.study.refactoring.chapter8;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class IntervalWindow extends Frame implements Observer {

    private Interval subject;
    java.awt.TextField startField;
    java.awt.TextField endField;
    java.awt.TextField lengthField;

    public IntervalWindow() {
        SymFocus s = new SymFocus();

        startField = new TextField("1");
        startField.setBounds(50,50,150,20);
        startField.addFocusListener(s);
        endField = new TextField("1");
        endField.setBounds(50,100,150,20);
        endField.addFocusListener(s);
        lengthField = new TextField("1");
        lengthField.setBounds(50,150,150,20);
        lengthField.addFocusListener(s);

        subject = new Interval();
        subject.addObserver(this);
        update(subject, null);

        add(new Label("start"));
        add(startField);
        add(new Label("end"));
        add(endField);
        add(new Label("length"));
        add(lengthField);
        setSize(500, 300);
        setLayout(new GridLayout(3, 2, 0, 0));
        setVisible(true);
    }

    public void update(Observable observed, Object arg) {
        startField.setText(subject.getStart());
        lengthField.setText(subject.getLength());
        endField.setText(subject.getEnd());
    }

    void StartField_FocusLost(java.awt.event.FocusEvent event) {
        setStart(startField.getText());
        if (isNotInteger(getStart())) {
            setStart("0");
        }
        subject.calculateLength();
    }

    void EndField_FocusLost(java.awt.event.FocusEvent event) {
        setEnd(endField.getText());
        if (isNotInteger(getEnd())) {
            setEnd("0");
        }
        subject.calculateLength();
    }

    void LengthField_FocusLost(java.awt.event.FocusEvent event) {
        setLength(lengthField.getText());
        if (isNotInteger(getLength())) {
            setLength("0");
        }
        subject.calculateEnd();
    }

    boolean isNotInteger(String text) {
        return !text.matches("-?\\d+");
    }

    class SymFocus extends java.awt.event.FocusAdapter {
        public void focusLost(java.awt.event.FocusEvent event) {
            Object object = event.getSource();
            if (object == startField) {
                StartField_FocusLost(event);
            } else if (object == endField) {
                EndField_FocusLost(event);
            } else if (object == lengthField) {
                LengthField_FocusLost(event);
            }
        }
    }

    String getStart() {
        return subject.getStart();
    }

    void setStart (String arg) {
        subject.setStart(arg);
    }

    String getLength() {
        return subject.getLength();
    }
    void setLength (String arg) {
        subject.setLength(arg);
    }

    String getEnd() {
        return subject.getEnd();
    }

    void setEnd (String arg) {
        subject.setEnd(arg);
    }

    public static void main(String[] args) {
        IntervalWindow f = new IntervalWindow();
    }
}