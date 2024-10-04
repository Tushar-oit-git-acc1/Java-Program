//Perfect no. program.

import java.util.*;
public class Five 
{
    public static void main(String[] args) 
    {
        int i,n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();
        sc.close();

        for(i=1;i<= n/2;i++)
        {
            if(n%i == 0)
            {
                sum += i;
            }
        }

        if(sum == n)
        {
            System.out.println(n+" is a perfect no.");
        }else
        {
            System.out.println(n+" is not a perfect no.");
        }

    }
}
