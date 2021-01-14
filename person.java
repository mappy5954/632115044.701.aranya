package lab8_in;

public class person {
    String name;
    int age;
    String gender;
    public person(){

    }
    public person(String name, int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    
    public void introduce(){
        System.out.println("My name is "+name);
        System.out.println("I'm "+age+" year old");
        System.out.println("I'm is a "+gender);
    }
}

