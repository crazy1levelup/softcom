package com.firmasoft.eduard;

public class Programator extends Angajati implements Salariu {

    private int aniXp;
    private String limbajeProg;

    Programator(String nume, long CNP, int aniXp, String limbajeProg) {
        super(nume, CNP);
        this.aniXp = aniXp;
        this.limbajeProg = limbajeProg;
    }

    public Programator() { }

    void showPrg() {
        System.out.println("Proramator: " + nume + ", CNP: " + CNP + ", ani de experienta: " + aniXp + ", limbaje de programare: " + limbajeProg + "    Cont: " + valCont + ".");

    }

    @Override
    public void getMoney(double sal) {
        valCont += sal + 500 * aniXp;
    }

    @Override
    public void spendMoney(double expenditure) {

    }

    void addRam(int ram) {
        if (ram < 1) {
            System.out.println("Error! No ram added");
        } else {
            valCont = valCont + 100 * ram;
        }
    }
}

