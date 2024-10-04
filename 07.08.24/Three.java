//Program to check if the i/p no. is a prime or not.

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int n,i,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();
        sc.close();

    

        for(i=2;i<= (n/2);i++)
        {
            if(n%i == 0)
            {
                flag = 1;
            }
        }

        if(flag==0)
        {
            System.out.print(n+" is prime");
        }else
        {
            System.out.println(n+" is not prime");
        }
    }
    
}
