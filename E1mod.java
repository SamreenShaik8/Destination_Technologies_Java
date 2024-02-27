import java.util.*;
public class E1mod {
    public static void main(String[] args) {
        int a[][]=new int[3][5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a[i].length-1;j++){
                System.out.println("Enter marks of student "+j+" of classroom "+i);
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
