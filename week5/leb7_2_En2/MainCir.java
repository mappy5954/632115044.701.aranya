import javax.lang.model.type.IntersectionType;

public class MainCir {
    public static void main(String[]agrs){
        Circle cir1 = new Circle(0.0,0.0,2);
        cir1.Area();
        cir1.Circum();
        
        Circle cir2 = new Circle(1.0,2.0,3);
        cir2.Area();
        cir2.Circum();

        Circle cir3 = new Circle(3.0,5.0,1);
        cir3.Area();
        cir3.Circum();

        Circle cir4 = new Circle(-1.0,-10.0,-1);
        cir4.Area();
        cir4.Circum();

        System.out.println("Is circle 1 intersec circle 2 :"+cir1.Intersect(cir2));
        System.out.println("Is circle 1 intersec circle 3 :"+cir1.Intersect(cir3));
    }
}
