//Multiplcation of adjacent digits of a no.
//i/p - 1234  o/p- 20   (1*2 + 2*3 + 3*4)

import java.util.Scanner;

public class Seven 
{
    public static void main(String[] args) 
    {
        int n,n1,n2,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();

        while(n>0)
        {
            n1 = n%10;
            n = n/10;
            n2 = n%10;
            sum += n1*n2;   
        }   
        
        System.out.println("Output: "+sum);
    }    
}
