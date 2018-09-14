package com.firmasoft.eduard;

public class Secretar extends Angajati implements Salariu {

    private String limbi;

    Secretar(String nume, long CNP, String limbi) {
        super(nume, CNP);
        this.limbi = limbi;
    }

    public Secretar() { }

    @Override
    public void getMoney(double sal) {
        valCont += sal;
        System.out.println(nume + " primeste salariul: " + sal);
    }

    @Override
    public void spendMoney(double expenditure) {
        valCont = valCont - expenditure;
        System.out.println(nume + " cheltuie " + expenditure + "    Cont curent: " + valCont);
    }

    @Override
    public void getGift(){
        valCont = valCont + 250;
        System.out.println("Got a gift for christmass +250 " + "    Cont curent: " + valCont );
    }
    void showSct() {
        System.out.println("Secretar: " + nume + ", CNP: " + CNP + ", limbi straine: " + limbi + "    Cont: " + valCont + ".");

    }
}
