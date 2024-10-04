//Fibonacci Series of 'n' nos.

import java.util.*;
public class Two {
    public static void main(String[] args) {
        int i,n,fibo,f1=0,f2=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();
        
        if(n==0)
        {
            System.out.println("Invalid no.");
        }else if(n == 1)
        {
            System.out.print(f1);
        }else
        {
            System.out.print(f1+" "+f2+" ");
        }
        

        for(i=3;i<=n;i++)
        {
            fibo = f1 + f2;
            System.out.print(fibo+" ");
            f1 = f2;
            f2 = fibo;
           
        }


    }  

}
