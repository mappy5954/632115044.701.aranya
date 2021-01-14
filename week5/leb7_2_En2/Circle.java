public class Circle {
    private double radius = 0;
    private double x = 0;
    private double y = 0;
    private double circumFerence = 0;
    private static int numObject = 0;

    public Circle(double x, double y) {
        numObject++;
        this.x = x;
        this.y = y;
        this.radius = 1;
    }

    public Circle(double x, double y, double radius) {
        numObject++;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void Area() {
        if (radius < 0) {
            System.out.println("Area of cir" + numObject + " = 0");
        } else {
            System.out.println("Area of cir" + numObject + " = " + Math.PI * (radius * radius));
        }
    }

    public void Circum() {
        if (radius < 0) {
            System.out.println("CircumFrenece = 0");
        } else {
            System.out.println("CircumFrenece = " + (2 * Math.PI * radius));
        }
    }

    public boolean Intersect(Circle C2) {
        double Distance = Math.sqrt(Math.pow(this.x - C2.x, 2) + Math.pow(this.y - C2.y, 2));
        if (Distance > this.radius + C2.radius) {
            return false;
        } else {
            return true;
        }
    }
}
