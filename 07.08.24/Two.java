//Accept one no. from user & display its factors.

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();
        sc.close();

        System.out.println("Factors of "+n+" are: ");

        for(i=1;i<= (n/2);i++)
        {
            if(n%i == 0)
            {
                System.out.print(i+",  ");
            }
        }
        System.out.print(n);
    }
    
}
