//Function: for factorial & max. no.
//Type 1: No Parameter No Return

import java.util.Scanner;

public class Two 
{
    
    //Factorial function
    static void fact()
    {
        System.out.println("factorial");
        Scanner sc = new Scanner(System.in);
        int i,n,fact=1;
        System.out.println("Enter a no.");
        n = sc.nextInt();

        for(i=n;i>1;i--)
        {
            fact = fact * i;
        }

        System.out.println(n+" factorial: "+fact);
    }

    //Max no. function
    static void max()
    {
        System.out.println("Maximum no.");
        Scanner sc = new Scanner(System.in);
        int a,b,max;
        System.out.println("Enter first no.");
        a = sc.nextInt();
        System.out.println("Enter second no.");
        b = sc.nextInt();

        if(a>b)
        {
            max = a;
        }else
        {
            max = b;
        }

        System.out.println("Max no. "+max);
    }

    static void prime()
    {
        System.out.println("Prime no.");
        Scanner sc = new Scanner(System.in);
        int i,j,n,count=0;
        System.out.println("Enter the count for prime nos.");
        n = sc.nextInt();

        
        System.out.println("");
        
        /*System.out.println("Prime nos:");
        //System.out.print("1"+" "+"2"+" ");
        while(count<=n)
        {
            for(int i=1;i<=)
        }
        
        for(i = 1;i<=100;i++)
        {
            for(j=1;j<=100;j++)
            {
                if(i==1 || i==2)
                {
                    System.out.print(i+" "); 
                    count++;
                }else
                {
                    for(j = 2;j< i;j++)
                    {
                        if(i%j != 0)
                        {
                            System.out.print(i+" ");
                            count++;
                        }
                    }
                }
            }*/
            
            
            
            
        }
    }
    
    
    public static void main(String[] args) 
    {
        //fact();

        //max();

        prime();
    }    
}
