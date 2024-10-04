//Sum of array elemnts - Diagonally


import java.util.Scanner;

public class Five 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int  arr[][] =  {{1,2,4},{2,3,7},{7,4,1}};
        int sum =0;
        
            
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr[i].length;j++)
            {
                if(i == j)
                {
                    sum += arr[i][j];
                }
                
            }
        }
        sc.close();

        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }  
        
        System.out.println("Array Diagonal Sum: "+sum);
    }    
}
