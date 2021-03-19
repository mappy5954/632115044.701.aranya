package week13;
//Aranya Baramimahasan 632115044

public class Rectangle extends Shape {
    double w;
    double h;
    double area;

    Rectangle(){
        super();
    }

    Rectangle(double w, double h){
        this.w = w;
        this.h = h;
    }

    public void cal() {  
        area = w*h;
        System.out.println("Rectangle : " +area);
    }
}

