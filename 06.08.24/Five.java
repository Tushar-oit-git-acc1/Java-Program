//Factorial of n

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        int i,num,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the no.");
        num = sc.nextInt();
        sc.close();

        for (i=num;i>1;i--)
        {
            fact *= i;
        }
        System.out.println("factorial of "+num+" is "+fact);
    }    
}
