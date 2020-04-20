package com.pubg.xtrm.study.refactoring.chapter10;

public class Security {

    void checkSecurity(String[] people) {
        sendAlert(people);
        String found = foundPerson(people);
        // someLaterCode(found);
    }

    void sendAlert(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                // sendAlert();
                return;
            }
            if (people[i].equals("John")) {
                // sendAlert();
                return;
            }
        }
    }

    String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }
            if (people[i].equals("John")) {
                return "John";
            }
        }
        return "";
    }
}
