package week7_1;

public class speed extends bicycle {
    double speedUp = 5;
    double brake = 5;

    public speed(String name, double speed) {
        System.out.println("My Bicycle");
        this.name = name;
        this.speed = speed;
    }

    public void speedUp() {
        speed += speedUp;
        System.out.println(name + " After speed up: " + speed);

    }

    public void brake() {
        speed -= brake;
        System.out.println(name + " After break: " + speed);

    }

}
