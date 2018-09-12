package com.firmasoft.eduard;


public class Person extends Angajati {
    private String userName;
    private String name;
    private String familyName;
    private String addres;

    public Person(String userName, String name, String familyName, String addres, String nume, long CNP){
        super();
        this.userName = userName;
        this.name = name;
        this.familyName = familyName;
        this.addres = addres;
    }
public void showPerson(){
        System.out.println(userName + name + familyName + addres + nume + CNP);
}

    }

