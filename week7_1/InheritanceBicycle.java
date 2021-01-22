package week7_1;

public class InheritanceBicycle {
    public static void main(String[] args) {
        speed bice = new speed("Turbo", 10);
        bice.showSpeed();
        bice.speedUp();
        bice.brake();
System.out.println("----------------------------------------");
        mountainBike bike = new mountainBike("Turbo 1.2", 10);
        bike.showSpeed();
        bike.speedUp1();
        bike.brake1();

    }
}
