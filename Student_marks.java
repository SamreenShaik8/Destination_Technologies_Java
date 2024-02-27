// import java.util.*;
// public class Student_marks {
//     public static void main(String[] args) {
//         int a[]=new int[5];
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter marks");
//         a[0]=sc.nextInt();
//         System.out.println("Enter marks");
//         a[1]=sc.nextInt();
//         System.out.println("Enter marks");
//         a[2]=sc.nextInt();
//         System.out.println("Enter marks");
//         a[3]=sc.nextInt();
//         System.out.println("Enter marks");
//         a[4]=sc.nextInt();
//         System.out.println(a[0]);
//         System.out.println(a[1]);
//         System.out.println(a[2]);
//         System.out.println(a[3]);
//         System.out.println(a[4]);

//     }
// }

import java.util.*;
public class Student_marks {

    public static void main(String[] args) {
        // creating an array
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=a.length-1;i++){
            System.out.println("Enter Marks:");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
    }
}
