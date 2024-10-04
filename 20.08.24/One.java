//Reverse a no.
//Same logic for operations on digits of a no.
//'%'' gives the last digit of a no. & '/'

import java.util.Scanner;

public class One
{
    public static void main(String[] args) 
    {
        int n,n1,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();

        while(n>0)
        {
            n1 = n%10;
            n = n/10;
            sum = (sum*10) + n1;
        }

        System.out.println("Revresed no.= "+sum);

    }
}

