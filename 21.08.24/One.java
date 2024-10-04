//Disarium no. Ex. 135,  1^1 + 3^2 + 5^3 =135. It's disarium no.

import java.util.Scanner;

public class One
{
    public static void main(String[] args) 
    {
        int i,n,n1,num,f1,sum=0,digits=0,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();
        
        num = n;
        p = n;
        while(n>0)
        {
            digits++;
            num = num/10;
        }
        while(n>0)
        {
            n1 = n%10;
            n = n/10;
            f1 = 1;
            for(i=1;i<=digits;i++)
            {
                f1 *= n1; 
            }
            digits--;
            sum += f1;
        }
        if(sum == p) 
        {
            System.out.println("Disarium");
        }else
        {
            System.out.println("not Disarium");
        }
    }
}