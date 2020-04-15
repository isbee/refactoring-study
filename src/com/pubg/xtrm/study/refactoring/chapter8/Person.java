package com.pubg.xtrm.study.refactoring.chapter8;

public class Person {

    public static final int O = BloodGroup.O.getCode();
    public static final int A = BloodGroup.A.getCode();
    public static final int B = BloodGroup.B.getCode();
    public static final int AB = BloodGroup.AB.getCode();

    private BloodGroup bloodGroup;

    // e.g. Person person = new Person(BloodGroup.A);
    public Person(int bloodGroup) {
        this.bloodGroup = BloodGroup.code(bloodGroup);
    }

    // e.g. person.setBloodGroup(BloodGroup.AB)
    public void setBloodGroup(int arg) {
        this.bloodGroup = BloodGroup.code(arg);
    }

    public int getBloodGroup() {
        return bloodGroup.getCode();
    }
}
