package week9;

public class Sheriff extends Person {
    String workState;

    public Sheriff(String name, int bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }
    
    // overiding method
    public void introduce() {
        super.introduce();
        System.out.println("I'm a sherff and work in "+workState+".");
    }
}
