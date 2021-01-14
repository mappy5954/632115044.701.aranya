package lab8_in;

public class engineer extends person{
    String genre;
    public engineer(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void about(){
        System.out.println(name+" is a "+genre+" engineer . ");
    }
    
}
