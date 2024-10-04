//Program for power

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        int i,x,n,pow=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base x");
        x = sc.nextInt();

        System.out.println("Enter the power n");
        n = sc.nextInt();
        sc.close();

        for(i=1;i<=n;i++)
        {
            pow*=x;
        }
        System.out.println(n+" to the power of "+x+" is "+pow);
    }
    
}
