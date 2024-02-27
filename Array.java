public class Array {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        System.err.println(a[0]);
        System.err.println(a[1]);
        // for 2,3,4 we not assign any value so the jvm will give default values.
        System.err.println(a[2]);
        System.err.println(a[3]);
        System.err.println(a[4]);
    }
}
