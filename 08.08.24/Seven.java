//Program to print n^n

import java.util.Scanner;

public class Seven 
{
    public static void main(String[] args) {
        int i,n,pow=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();

        for(i=1;i<=n;i++)
        {
            pow *=n;
        }

        System.out.println(n+"^"+n+" = "+pow);
    }    
}
