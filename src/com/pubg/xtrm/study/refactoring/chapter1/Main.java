package com.pubg.xtrm.study.refactoring.chapter1;

public class Main {

    public static void main(String[] args) {
        Customer seunghyun = new Customer("seunghyun");
        Movie romance = new Movie("about time", Movie.REGULAR);
        Movie action = new Movie("avengers", Movie.NEW_RELEASE);
        seunghyun.addRental(new Rental(romance, 3));
        seunghyun.addRental(new Rental(action, 7));

        System.out.println(seunghyun.statement());
    }
}
