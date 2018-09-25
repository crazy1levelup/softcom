package com.firmasoft.eduard;

public class Encap {

    private String name;
    private String userName;
    private int id;
    private String sentence;
    private String theCharacter;

    public String getName(){
        return name;
    }
    public String getUserName(){
        return userName;
    }
    public int getNumber(){ return id; }
    public void setName(String newName){
        name = newName;
    }
    public void setUserName(String newUserName){
        userName = newUserName;
    }
    public void setNumber(int newId){
        id = newId;
    }

    public Integer returnNumberOfSameChar(){
        int count =0;
        for (int i = 0; i< sentence.length(); i++){
            if (sentence.substring(i, i + 1).equals(theCharacter)){
            count ++; }
        }
        return count;
    }
    public String getCharacters(){
        return sentence; }
    public String getTheCharacter(){
        return theCharacter; }
    public void setCharacters(String newChars){
        sentence = newChars; }
    public void setTheCharacter(String newCharacter){
        theCharacter = newCharacter; }
}