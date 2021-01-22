package week7_1;

public class bicycle {
    String name;
    double speed;


    public bicycle() {

    }

    public bicycle(String name, double speed) {
        this.name = name;
        this.speed = speed;
      
    }

    public void showSpeed() {
        System.out.println(name + " current speed is " + speed);

    }

}
