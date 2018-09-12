package com.firmasoft.eduard;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){




             Secretar s2 = new Secretar("engleza, franceza", "Alina", 1723849385832L );
             s2.getMoney(1000);
             s2.spendMoney(300);
             s2.showSct();




             Programator p2 = new Programator("Mircea", 1940721205560L, 2,"Java, C++, PHP" );
             p2.getMoney(2000);
             p2.addRam(1);
             p2.showPrg();



            Inginer i2 = new Inginer("specialist in calculatoare", "Cristi", 7483748594832L);
            i2.getMoney(1500);
            i2.changeHard(1);
            i2.spendMoney(1500);
            i2.spendMoney(400);
            i2.addRam(1);
            i2.spendMoney(400);
            i2.showIng();


        }


    }

