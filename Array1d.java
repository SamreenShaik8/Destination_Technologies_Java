// import java.util.*;
// public class Std_Marks{
//     public static void main(String[] args) {
//         int a[]=new int[5];
//         Scanner sc=new Scanner(System.in);
//         int i;
//         i=0;
//         while(i<=a.length-1){
//             System.out.println("Enter Marks");
//             a[i]=sc.nextInt();
//             i++;
//         }
//         i=0;
//         while(i<=a.length-1){
//             System.out.println(a[i]);
//             i++;
//         }
//     }
// }

// above program by using while
// below program is by using do while

import java.util.*;
public class Array1d{
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int i;
        i=0;
        do{
            System.out.println("Enter Marks");
            a[i]=sc.nextInt();
            i++;
        }while(i<=a.length-1);
        i=0;
        do{
            System.out.println(a[i]);
            i++;
        }while(i<=a.length-1);
    }
}