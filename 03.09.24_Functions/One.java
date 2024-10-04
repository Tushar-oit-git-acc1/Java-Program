//

import java.util.Scanner;

public class One
{
    static String prime()
    {
        int n,i,flag=0;
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();

        for(i=2;i <= n/2;i++)
        {
            if(n%i == 0)
            {
                flag = 1;
            }
        }

        if(flag==0)
        {
            str = "This is a prime no.";
        }else
        {
            str = "This is not a prime no.";
        }

        return str;
    }
    

        
    
    public static void main(String[] args) 
    {
        String ans = prime();
        System.out.println(ans);        
    }




    
    
}