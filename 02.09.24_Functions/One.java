//Function: for addition
//Type 1: No Parameter No Return

import java.util.Scanner;

public class One
{

    static void add()
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first no.");
        a = sc.nextInt();
        System.out.println("Enter second no.");
        b = sc.nextInt();
        sc.close();

        c = a+b;
        System.out.println("Addition= "+c);
    }


    public static void main(String[] args)
    {
        for(int i=1;i<=3;i++)
        {
            add();
        }
        
    }
}