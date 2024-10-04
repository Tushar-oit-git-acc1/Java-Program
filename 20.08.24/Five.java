//Sum of fisrt & last digit of a no.

import java.util.Scanner;

public class Five 
{
    public static void main(String[] args) 
    {
        int n,n1,first=0,last=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();

        last = n%10;   //to get the last digit
        while(n>0)
        {
            
            
            first = n;
            n = n/10;
            
        }
        sum = first+ last;
        
        System.out.println("Sum of digits= "+sum);
    }    
}
