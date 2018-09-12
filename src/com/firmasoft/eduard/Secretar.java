package com.firmasoft.eduard;

public class Secretar extends Angajati implements Salariu{

    String limbi;
    public Secretar(String limbi, String nume, long CNP){
        super(nume, CNP);
        this.limbi = limbi;
    }
public Secretar(){

}
    @Override

    public void getMoney(double sal) {
        valCont += sal;

    }

    @Override
    public void spendMoney(double expenditure) {
        valCont = valCont - expenditure;
    }
    public void showSct(){
        System.out.println("Secretar: " + nume + ", CNP: " + CNP + ", limbi straine: " +limbi + "    Cont: " + valCont + ".");

    }
}
