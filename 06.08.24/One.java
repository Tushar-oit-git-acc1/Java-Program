//Sum of odd nos. upto n.

import java.util.Scanner;

public class One{
    public static void main(String[] args) {

        int i,num,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        num = sc.nextInt();
        sc.close();

        
        for(i=1;i<=num;i+=2)
        {
            sum+=i;
        }

        System.out.println("Sum of odd nos. upto "+num+" is "+sum);


    }
}