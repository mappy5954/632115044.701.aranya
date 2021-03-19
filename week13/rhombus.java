package week13;
//Aranya Baramimahasan

public class rhombus extends Shape {
    double w;
    double h;
    double area;

    rhombus(){
        super();
    }

    rhombus(double w, double h){
        this.w = w;
        this.h = h;
    }

    public void cal() {  
        area = w*h;
        System.out.println("Rhombus : " +area);
    }
}

