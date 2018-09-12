package com.firmasoft.eduard;

public class Inginer extends Angajati implements Salariu {

    private String specializare;

    Inginer(String specializare, String nume, long CNP) {
        super(nume, CNP);
        this.specializare = specializare;

    }

    Inginer() {}

    @Override
    public void getMoney(double sal) {
        valCont += sal;
    }

    @Override
    public void spendMoney(double expenditure) {
        if (expenditure > valCont) {
            System.out.println("Error! Esti sarac." + nume);
        } else {
            valCont = valCont - expenditure;
        }
    }

    void showIng() {
        System.out.println("Inginer sistem: " + nume + ", CNP: " + CNP + ", specializare: " + specializare + "    Cont: " + valCont + ".");
    }

    void changeHard(int hard) {
        if (hard < 1) {
            System.out.println("Error, No hard has been changed");
        } else {
            valCont = valCont + 300 * hard;
        }
    }

    void addRam(int ram) {
        if (ram < 1) {
            System.out.println("Error! no ram to be added");
        } else {
            valCont = valCont + ram * 200;

        }
    }

}