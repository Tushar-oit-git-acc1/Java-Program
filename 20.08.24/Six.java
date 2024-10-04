//Count the no. of odd,even digits & zeros in a no.

import java.util.Scanner;

public class Six 
{
    public static void main(String[] args) 
    {
        int n,n1,odd=0,even=0,zero=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();

        while(n>0)
        {
            n1 = n%10;
            n = n/10;
            if(n1==0)
            {
                zero++;
            }else if(n1%2 == 0)
            {
                even ++;
            }else
            {
                odd++;
            }
            
        }
        
        
        System.out.println("Odd digits : "+odd+"\nEven digits: "+even+"\nZero      : "+zero);      
    }    
}
