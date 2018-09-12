package com.firmasoft.eduard;

import java.math.BigInteger;
import java.util.ArrayList;

public class Programator extends Angajati implements Salariu {


    int aniXp;
    String limbajeProg;
    public Programator(String nume, long CNP, int aniXp, String limbajeProg ) {
        super(nume, CNP);
        this.aniXp = aniXp;
        this.limbajeProg = limbajeProg;


    }
    public Programator(){

}
public void showPrg(){
        System.out.println("Proramator: " + nume +", CNP: " + CNP + ", ani de experienta: " + aniXp + ", limbaje de programare: " + limbajeProg + "    Cont: " + valCont + "." );

}
    @Override
    public void getMoney(double sal) {
        valCont += sal + 500*aniXp;
    }

    @Override
    public void spendMoney(double expenditure) {

    }

public void addRam(int ram){
if ( ram <1){
    System.out.println("Error! No ram added");
}
else{
    valCont = valCont + 100*ram;
}
}
    }

