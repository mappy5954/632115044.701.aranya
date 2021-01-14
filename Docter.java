package lab8_in;

public class Docter extends person{
    String genre;
    public Docter(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void doc(){
        System.out.println(name+" is a "+genre+" doctor in hospihal. ");
    }
    
}
