//Print multiplication table using * operator.

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int i,ans,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        num = sc.nextInt();
        sc.close();
       
        for(i=1;i<=10;i++)
        {
            ans=num*i;
            System.out.println(num+" x "+i+" =  "+ans);
        }

    }
   
}
