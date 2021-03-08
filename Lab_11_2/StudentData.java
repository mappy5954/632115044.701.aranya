package Lab_11_2;
public class StudentData {
    
    public static void main(String[] args) {
        
        Student std01 = new Student("Mark",18,4.00);
        Student std02 = new Student("Jane",18,2.20);
        Student std03 = new Student("Peter",19,4.00);
        Student std04 = new Student("Mark",22,1.75);


        System.out.println("/////Name/////");
        System.out.println(std01.Name.equals(std02.Name));
        System.out.println(std01.Name.equals(std03.Name));
        System.out.println(std02.Name.equals(std04.Name));
        System.out.println(std01.Name.equals(std04.Name));
        System.out.println("/////age/////");
        System.out.println(std01.Age.equals(std02.Age));
        System.out.println(std03.Age.equals(std04.Age));
        System.out.println(std01.Age.equals(std03.Age));
        System.out.println("/////gpa/////");
        System.out.println(std01.GPA.equals(std03.GPA));
        System.out.println(std02.GPA.equals(std04.GPA));
        System.out.println(std02.GPA.equals(std03.GPA));
    }



    
} 