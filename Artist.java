package lab8_in;

import week4.Person;

public class Artist extends person{
    String genre;
    public Artist(String name,int age){
        this.age = age;
        this.name = name;
    }
    public void playMusic(){
        System.out.println(name+" is playing "+genre+" music. ");
    }
}
