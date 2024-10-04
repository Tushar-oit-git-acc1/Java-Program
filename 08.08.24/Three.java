//GCD - Greatest no. which divides both the nos.  & LCM - Smallest no. which is divisible by both the nos.

import java.util.Scanner;

public class Three 
{
    public static void main(String[] args) 
    {
        int i,gcd=0,lcm,a,b,n;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter first no.");
        a = sc.nextInt();
        System.out.println("Enter second no.");
        b = sc.nextInt();
        sc.close();

        if(a<b)
        {
            n = a;
        }else
        {
            n = b;
        }

        for(i=1;i<=n;i++)
        {
            if(a%i == 0 && b%i == 0)
            {
                gcd = i;
            }
        }

        lcm = (a * b) / gcd;

        System.out.println("LCM of "+a+" & "+b+" = "+lcm);
        System.out.println("GCD of "+a+" & "+b+" = "+gcd);


    }
    
}
