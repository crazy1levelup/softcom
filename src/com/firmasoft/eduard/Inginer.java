package com.firmasoft.eduard;

public class Inginer extends Angajati implements Salariu{

    private String specializare;

    Inginer(String nume, long CNP, String specializare) {
        super(nume, CNP);
        this.specializare = specializare;

    }

    Inginer() {}

    @Override
    public void getMoney(double sal) {
        valCont += sal;
        System.out.println(nume + " primeste salariul: " + valCont);
    }

    @Override
    public void spendMoney(double expenditure) {
        System.out.println(nume + " Foloseste " + expenditure + " lei din " + valCont);
        if(expenditure > valCont) {
            System.out.println("Error! Esti sarac." + nume);
        } else {
            valCont = valCont - expenditure;
        }
    }
    @Override
    public void getGift() {
        valCont = valCont + 250;
        System.out.println(nume + " got a gift for christmass +250 " + "    Cont curent: " + valCont);
    }

    void showIng() {
        System.out.println("Inginer sistem: " + nume + ", CNP: " + CNP + ", specializare: " + specializare + "    Cont: " + valCont + ".");
    }

    void changeHard(int hard) {
        if (hard < 1) {
            System.out.println("Error, No hard has been changed");
        } else {
            int sum;
            sum=hard*300;
            valCont = valCont + sum;
            System.out.println(nume + " a schimbat un hard, primeste " +sum + "    Cont curent: " + valCont);
        }
    }

    void addRam(int ram) {
        if (ram < 1) {
            System.out.println("Error! no ram to be added");
        } else {
            int sum;
            sum = ram*200;
            valCont = valCont + sum;
            System.out.println(nume + " a schimbat un hard, primeste " +sum + "    Cont curent: " + valCont + "    Cont curent: " + valCont);
        }
    }

}