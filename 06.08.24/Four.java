//Multiplication table without using * operator

import java.util.Scanner;

public class Four{
    public static void main(String[] args) {
        int i,ans=0,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        num = sc.nextInt();
        sc.close();
        
        for(i=1;i<=10;i++)
        {
            ans+=num;
            System.out.println(num+" x "+i+" = "+ans);
            
        }   

    }
       
    }
