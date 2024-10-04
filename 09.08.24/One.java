//GCD & LCM program practice.

import java.util.Scanner;

public class One
{
    public static void main(String[] args) 
    {
        int n,i,a,b,gcd=0,lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        a = sc.nextInt();
        System.out.println("Enter second no.");
        b = sc.nextInt();

        if(a<b)
        {
            n=a;
        }else
        {
            n=b;
        }

        for(i=1;i<=n;i++)
        {
            if(a%i == 0 && b%i ==0)
            {
                gcd = i;
            }
        }

        lcm = (a*b) / gcd;
        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+lcm);

    }
}