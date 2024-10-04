//Print a no. in words

import java.util.Scanner;
public class Eight 
{
    public static void main(String[] args) 
    {
        int n,n1,n2,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();
        
        while(n>0)
        {
            n1 = n%10;
            n = n/10;
            sum = (sum*10) + n1;
        }
        n = sum;
        while(n>0)
        {
            n1 = n%10;
            
            n = n%10;
            

            switch (n1) {
                case 0:System.out.println("zero");
                
                case 1:System.out.println("one");
                
                case 2:System.out.println("two");
                
                case 3:System.out.println("three");
                
                case 4:System.out.println("four");
                
                case 5:System.out.println("five");
                
                case 6:System.out.println("six");
                
                case 7:System.out.println("seven");
                
                case 8:System.out.println("eight");
                
                case 9:System.out.println("nine");    
                
                
            }
        }
    }    
}
