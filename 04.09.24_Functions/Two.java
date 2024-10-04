//!pattern, pronic, magic, binary

import java.util.Scanner;

public class Two 
{

    static void pattern()
    {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of traingle");
        n = sc.nextInt();

        if(n<=0)
        {
            System.out.println("Invalid Input. please enter a positive value");
        }else if(n%2 ==0)
        {

        }else
        {
            for(i=1;i<=n;i++)
            {
                for(j=n;j>=1;j--)
                {
                    
                    if(j<=i)
                    System.out.print(" *");
            
                }
                System.out.println();
                
            }
        }
        
    } 

    public static void main(String[] args) 
    {
        
        pattern();
    }
    
}
