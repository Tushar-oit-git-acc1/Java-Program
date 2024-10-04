//No. series

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int i,n,c=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();
        sc.close();
        System.out.print("Sum= ");


        for(i=1;i<=n;i++)
        {
            
            
            System.out.print(c+"x"+n);
            c+=2;
            if(i<n)
            {
                System.out.print("+"); 
            }
           
        }
    }  
    
}
