/* !Works properly only for odd i/p
    * 
    *
* * * * *
    *
    *
 */

import java.util.Scanner;

public class Four 
{
    public static void main(String[] args) 
    {
        int i,j,n,num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a no.");
        num = sc.nextInt();

        if(num%2 == 0)
        {
            n = num/2 + 1;
        }else
        {
            n = (num/2) + 1;
        }
        
        System.out.println("n="+n);

        for(i=1;i<=num;i++)
        {
            if(i==n)
            {
                for(j=1;j<=num;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
                
            }else
            {
                
                for(j=1;j<=num;j++)
                {
                    if(j==n+2)
                    {
                        System.out.print("*");
                    }else
                    {
                        System.out.print(" ");
                    }
                    
                }
                System.out.println();
            }
            

            
            }
        
        
        

    }
    
}
