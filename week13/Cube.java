package week13;
//Aranya Baramimahasan 632115044

public class Cube extends Shape {
    double w;
    double h;
    double area;

    Cube(){
        super();
    }

    Cube(double w, double h){
        this.w = w;
        this.h = h;
    }

    public void cal() {
        area = w*h;   
        System.out.println("Cube : " +area);
    }
}