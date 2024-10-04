//Type 4: With Parameter With Return

import java.util.Scanner;

public class Fun4 {

    static String prime(int n)
        {
            int i,flag=0;
            String str;

            for(i=2;i<n;i++)
            {
                if(n%i ==0)
                {
                    flag =1;
                }

                
            }
            if(flag==0)
            {
                str = " is a prime no.";
            }else
            {
                str = " is not a prime no.";
            }

            return str;

            
        }
    
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no.");
        n = sc.nextInt();

        String ans = prime(n);
        
        System.out.println(n+ans);
        
    }
    
}
