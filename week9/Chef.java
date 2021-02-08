package week9;

public class Chef extends Person {
    String workState;

    public Chef(String name, int bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }
    
    // overiding method
    public void introduce() {
        super.introduce();
        System.out.println("I'm a chef and work in "+workState+".");
    }
    
}
