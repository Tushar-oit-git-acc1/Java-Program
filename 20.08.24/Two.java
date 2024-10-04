//Armstrong no.


import java.util.*;
public class Two 
{
    public static void main(String[] args) 
    {
        
        int n,n1,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();

        while(n>0)
        {
            n1 = n%10;
            n = n/10;
            sum = sum + (n1 * n1 * n1);
        }

        
        System.out.println("Revresed no.= "+sum);

    }   
       
}
