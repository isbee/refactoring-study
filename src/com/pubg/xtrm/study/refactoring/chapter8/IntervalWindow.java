package com.pubg.xtrm.study.refactoring.chapter8;

import java.awt.*;

public class IntervalWindow extends Frame {
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

    void StartField_FocusLost(java.awt.event.FocusEvent event) {
        if (isNotInteger(startField.getText())) {
            startField.setText("0");
        }
        calculateLength();
    }

    void EndField_FocusLost(java.awt.event.FocusEvent event) {
        if (isNotInteger(endField.getText())) {
            endField.setText("0");
        }
        calculateLength();
    }

    void LengthField_FocusLost(java.awt.event.FocusEvent event) {
        if (isNotInteger(lengthField.getText())) {
            lengthField.setText("0");
        }
        calculateEnd();
    }

    boolean isNotInteger(String text) {
        return !text.matches("-?\\d+");
    }

    void calculateLength() {
        try {
            int start = Integer.parseInt(startField.getText());
            int end = Integer.parseInt(endField.getText());
            int length = end - start;
            lengthField.setText(String.valueOf(length));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Unexpected Number Format Error");
        }
    }

    void calculateEnd() {
        try {
            int start = Integer.parseInt(startField.getText());
            int length = Integer.parseInt(lengthField.getText());
            int end = start + length;
            endField.setText(String.valueOf(end));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Unexpected Number Format Error");
        }
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

    public static void main(String[] args) {
        IntervalWindow f = new IntervalWindow();
    }
}