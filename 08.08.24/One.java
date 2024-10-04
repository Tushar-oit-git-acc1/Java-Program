//Pronic no. program (Not pronic means heteropronic).
//Pronic no: If the no. is a multiplicatication of two adjacent nos. then it's pronic

import java.util.*;
public class One
{
    public static void main(String[] args) 
    {
        int n,i,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();

        for(i=1;i<= n/2;i++)
        {
            if(i* (i+1) == n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(n+" is a pronic no.");
        }else
        {
            System.out.println(n+" is not a pronic no. or is a heteropronic no.");
        }
    }
}