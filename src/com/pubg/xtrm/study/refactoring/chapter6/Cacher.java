package com.pubg.xtrm.study.refactoring.chapter6;


public class Cacher {

    void totalPricer() {
//        int price = Meet.BEEF.price() + Book.E_BOOK.price();
//        return price;

          // or
//        int price = 0;
//        for (Product p : bascket) {
//            price += p.price();
//        }
//        return price;
    }

    enum Meet {
        DUCK(240),
        PORK(100),
        CHICKEN(240),
        BEEF(240);

        private int premium;

        Meet(int premium)  {
            this.premium = premium;
        }

        public int price(int weight) {
            return this.premium * weight;
        }
    }
}
