//Print the nos. divisible by 3 & 7 from 1 to 'n'

import java.util.Scanner;

public class Six 
{
    public static void main(String[] args) {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        n = sc.nextInt();

        for(i=1;i<=n;i++)
        {
            if(i%3 == 0 && i%7 == 0)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}
