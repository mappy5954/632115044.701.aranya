package lab8_in;

public class company extends person{
    String genre;
    public company(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void work(){
        System.out.println(name+" is a "+genre+" in company. ");
    }
    
}
