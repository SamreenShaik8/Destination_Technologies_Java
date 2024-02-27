import java.util.*;
public class Array3d {
    public static void main(String[] args) {
        int a[][][]=new int[2][3][3];
        Scanner sc=new Scanner(System.in);
       
        // i is for rows ->for classrooms
        for(int i=0;i<=1;i++){
            // j is for columns -.for student
            for(int j=0;j<=2;j++){
                for(int k=0;k<=2;k++){
                    System.out.println("Enter marks of student "+k+" of school "+j+" in class room "+i);
                    a[i][j][k]=sc.nextInt();
                }
            }
        }
        for(int i=0;i<=1;i++){
            for(int j=0;j<=2;j++){
                for(int k=0;k<=2;k++){
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
