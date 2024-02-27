class Dog{
    String name;
    int cost;
}
public class Referencetype_Assig {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Leo";
        d1.cost=1000;
        Dog d2;
        d2=d1;
        d2.name="snifer";
        d2.cost=2000;
        Dog d3;
        d3=d2;
        d3.name="Sunny";
        d3.cost=3000;
        System.out.println(d3.name);
        System.out.println(d1.name);
    }
}
