import java.util.*;
public class Empsal {
    public static void main(String[] args) {
        int a[][]=new int[2][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a[i].length-1;j++){
                System.out.println("Enter the salary of "+j+" emoloyee department "+i);
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a[i].length-1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        
        }
    }
}
