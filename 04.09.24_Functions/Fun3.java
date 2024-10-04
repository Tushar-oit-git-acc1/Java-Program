//Type 3: With parameter No Return

import java.util.Scanner;

public class Fun3
{
    
    static void prime(int n)
        {
            int i,flag=0;

            for(i=2;i<n;i++)
            {
                if(n%i ==0)
                {
                    flag =1;
                }

                
            }
            if(flag==0)
            {
                System.out.println(n+" is a prime no.");
            }else
            {
                System.out.println(n+" is not a prime no.");
            }

            
        }
    
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        prime(n);
        
        
    }
}