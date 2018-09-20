package com.firmasoft.eduard;
import java.lang.*;

public class Person{
    private String userName;
    private String name;
    private String familyName;
    private String addres;

    public Person(String userName, String name, String familyName, String addres){
        super();
        this.userName = userName;
        this.name = name;
        this.familyName = familyName;
        this.addres = addres;
    }
public void showPerson(){
        System.out.println(userName + name + familyName + addres);
}


public void deleteChar(String str, int numar) {
    String front = str.substring(0, numar);
    String back = str.substring(numar + 1);
    String tog = front + back;
    System.out.println(tog);
}

String deleteWord(String strg , String theword){
   int i = 0;
   int n = theword.length();
    while ( n <= strg.length()){
        if ( strg.substring(i , n).equals(theword)){
            return strg.substring( 0 , i) + strg.substring(n);
        } else {
            n +=1;
            i +=1;
        }
    }
    return strg;
    }
}



