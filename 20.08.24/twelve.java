//Trong or Krishnamurthy no.: sum of factorials of digits of a no.  Ex. i/p- 145   o/p- 1! + 2! + 5! = 145 hence, the no. is strong

import java.util.Scanner;

public class twelve 
{
    public static void main(String[] args) 
    {
        int i,n,n1,sum=0,fact,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();

        num =n;
        while(n>0)
        {
            n1 = n%10;
            n = n/10;
            fact = 1;
            for(i=n1;i>1;i--)
            {
                fact *= n1;
            }
            
            sum += fact; 
            //fact=0;
        }

        if(sum == num)
        {
            System.out.println(num+" is Strong/ Krishnamurthy no.");
        }else
        {
            System.out.println(num+" is not a Strong no.");    
        }    
        
    }
}
