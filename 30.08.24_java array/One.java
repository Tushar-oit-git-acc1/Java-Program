//Array: Sum of array elements.


import java.util.Scanner;
public class One
{
    public static void main(String[] args) 
    {
        int n = 5;
        int sum = 0;
        int[] arr = new int[n];    
        Scanner sc = new Scanner(System.in);
        

        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println("Enter element no: "+i);
            arr[i] = sc.nextInt(); 
        }
        sc.close();

        for(int elem:arr)
        {
            
            System.out.print(arr[elem]+" ");
           
        }

        for(int i=0;i<=arr.length-1;i++)
        {
            sum +=arr[i];
        }

        System.out.println("Sum of array elements: "+sum);


    }
} 