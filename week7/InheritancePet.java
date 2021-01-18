package week7;

public class InheritancePet {
    public static void main(String[] agrs) {
        Dog dog = new Dog("Lucky", "Poddle", "Brown", 2);
        dog.size = "Small";
        dog.hair = "Short";
        dog.ShowPetData();
        dog.Run();
        dog.Bark();
        dog.isShortHair();
        System.out.println("------------------------------------------------------------");
        
        Fish fish = new Fish("Qiu Qiu","Wels catfish","Albinism",50);
        fish.speed="1000";
        fish.water="Fresh water";
        fish.size="Long";
        fish.ShowPetData();
        fish.IsSwimToTheSea();
        fish.SwimFast();
        System.out.println("------------------------------------------------------------");

        Bird bird = new Bird("Magaty","Eagle","Brown",2);
        bird.country="USA";
        bird.fly="Singapore to Malaysia";
        bird.ShowPetData();
        bird.Speak();
        bird.Checkcountry();
        bird.Iscanfly();
        System.out.println("------------------------------------------------------------");
    }
}
