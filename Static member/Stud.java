import java.util.*;
class Stud1{
    private String name;
    private int age;
    static private String institute="Codegnan";
    public void setDta(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:"+name);
        name = sc.next();
        System.out.println("Enter your age:"+age);
        age= sc.nextInt();

    }
    public void display(){
        System.out.println("name is:"+name);
        System.out.println("age is:"+age);
        System.out.println("School is:"+institute);
    }
}
public class Stud {
     public static void main(String[] args) {
        Stud1 s1=new Stud1();
        s1.setDta();
        s1.display();
        Stud1 s2=new Stud1();
        s2.setDta();
        s2.display();
     }
    
}
        
    