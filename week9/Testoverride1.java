package week9;

import lab8_in.teacher;

public class Testoverride1 {
    public static void main(String[] args) {
        Person person1;
        Person person2;
        Person person3;
        Person person4;
        Person person5;
        Person person6;

        person1 = new Person("Mark", 2001);
        person1.introduce();
        person2 = new Sheriff("Mateo", 1988, "California");
        person2.introduce();
        person3 = new Teacher("Ball", 1977, "CMU");
        person3.introduce();
        person4 = new PM("Tu", 1954, "Thailand");
        person4.introduce();
        person5 = new Football("Messi", 1987, "Barcelona football club");
        person5.introduce();
        person6 = new Chef("Peter", 1981, "Paris restaurant");
        person6.introduce();
    }
}
