import java.util.*;
public class Array2d {
    public static void main(String[] args) {
        int a[][]=new int[3][5];
        Scanner sc=new Scanner(System.in);
       
        // i is for rows ->for classrooms
        for(int i=0;i<=2;i++){
            // j is for columns -.for student
            for(int j=0;j<=4;j++){
                System.out.println("Enter marks of student " + j +" class room " +i);
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=2;i++){
            for(int j=0;j<=4;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
