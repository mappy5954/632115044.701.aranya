package lab8_in;

public class teacher extends person{
    String genre;
    public teacher(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void teach(){
        System.out.println(name+" is a "+genre+" in school. ");
    }
    
}
