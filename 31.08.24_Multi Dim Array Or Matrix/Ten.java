
import java.util.Scanner;

//Scaler multiplication of matrix i.e. Multiplying matrix element with input no.

public class Ten 
{
    public static void main(String[] args) 
    {
        int[][] A = {{2,4,7},{1,6,7},{2,6,9}};
        int[][] B = new int[A.length][A.length];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a multiplying no.");
        int num = sc.nextInt();
        sc.close();

        for(int i=0;i< A.length;i++)
        {
            for(int j=0;j< A[i].length;j++)
            {
                B[i][j] = A[i][j] * num;
            }
        }


        System.out.println("Scaler multiplication of matrix A: ");
        for(int[] elem:B)
        {
            for(int j=0;j < elem.length;j++)
            {
                System.out.print(elem[j]+" ");
            }
            System.out.println();
        }
        
        
    }    
}
