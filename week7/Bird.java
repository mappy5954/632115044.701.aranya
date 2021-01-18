package week7;

public class Bird extends Pet {
    String country;
    String fly;

    public Bird(String name, String species, String color, int age) {
        System.out.println("My Bird");
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void Speak(){
        System.out.println(name +" is special bird it can speak 5 laguage");
    }
    public void Checkcountry(){
        System.out.println(name +" is from "+country);
    }
    public void Iscanfly(){
        System.out.println(name+" is special it can fly "+fly+" !!! ");
    }
}
