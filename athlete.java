package lab8_in;

public class athlete extends person{
    String genre;
    public athlete(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void sport(){
        System.out.println(name+" is a "+genre+". ");
    }
    
}