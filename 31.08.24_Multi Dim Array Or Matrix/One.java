//Creating a two dimensional array or matrix

//2D Array & 3x3 Matrix

import java.util.Scanner;

public class One
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int  arr[][] = new int[m][n];  //m,n = 3
        int sum =0;
        
            
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        sc.close();

        for(int i=0;i< m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }   
            System.out.println(); 
            
        }
    }
}