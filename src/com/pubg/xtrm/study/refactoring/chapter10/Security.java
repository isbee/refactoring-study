package com.pubg.xtrm.study.refactoring.chapter10;

public class Security {

    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        // someLaterCode(found);
    }

    String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                // sendAlert();
                return "Don";
            }
            if (people[i].equals("John")) {
                // sendAlert();
                return "John";
            }
        }
        return "";
    }
}
