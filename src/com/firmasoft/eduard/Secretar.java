package com.firmasoft.eduard;

public class Secretar extends Angajati implements Salariu {

    private String limbi;

    Secretar(String limbi, String nume, long CNP) {
        super(nume, CNP);
        this.limbi = limbi;
    }

    public Secretar() { }

    @Override
    public void getMoney(double sal) {
        valCont += sal;
    }

    @Override
    public void spendMoney(double expenditure) {
        valCont = valCont - expenditure;
    }

    void showSct() {
        System.out.println("Secretar: " + nume + ", CNP: " + CNP + ", limbi straine: " + limbi + "    Cont: " + valCont + ".");

    }
}
