package Lab_11;
class A {

    }
class B extends A{

    }
class C extends B{

    }

public class InstanceOFDemo {
    private static final char Object = 0;

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Object c = new C();
        //Test thm e instan of object and class
        System.out.println(a instanceof B);

    }
}


