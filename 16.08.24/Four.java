//No. series: factorial

import java.math.BigInteger;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();
        System.out.print("Sum= ");

        for(i=1;i<=n;i++)
        {
           
            BigInteger fact=BigInteger.ONE; //We can't keep 'fact' as an integer as the datatype 'Int' won't be able to store the factorial values after 12!.
            for(j=i;j>1;j--)
            {
                fact=fact.multiply(BigInteger.valueOf(j));
                
                
            }
            System.out.print(fact);
            if(i<n)
            {
                System.out.print("+");
            }
            

           
           
        }
    }  
    
}
