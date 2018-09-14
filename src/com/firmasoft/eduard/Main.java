package com.firmasoft.eduard;

public class Main {

    public static void main(String[] args) {

        Secretar s2 = new Secretar("Alina", 1942313459893L, "engleza, franceza");
        Programator p2 = new Programator("Mircea", 1940721205560L, 2, "Java, C++, PHP");
        Inginer i2 = new Inginer("Cristi", 7483748594832L, "specialist in calculatoare");

        s2.getMoney(1000);
        s2.spendMoney(300);
        s2.getGift();
        s2.showSct();

        System.out.println("");
        p2.getMoney(2000);
        p2.addRam(1);
        p2.getGift();
        p2.showPrg();

        System.out.println("");
        i2.getMoney(1500);
        i2.changeHard(1);
        i2.spendMoney(1500);
        i2.spendMoney(400);
        i2.addRam(1);
        i2.spendMoney(400);
        i2.getGift();
        i2.showIng();


    }


}

