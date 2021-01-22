package week7_1;

public class mountainBike extends bicycle{
    double speedUp = 5;
    double brake = 5;

    public mountainBike(String name, double speed) {
        System.out.println("My Bicycle");
        this.name = name;
        this.speed = speed;
    }

    public void speedUp1() {
        speed = speed+(2*speedUp);
        System.out.println(name + " After speed up: " + speed);

    }

    public void brake1() {
        speed -= brake;
        System.out.println(name + " After break: " + speed);

    }

}
