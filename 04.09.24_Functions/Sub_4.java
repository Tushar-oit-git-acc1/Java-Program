//With parameter With Return

import java.util.Scanner;

public class Sub_4 {
    static int sub(int a,int b)
        {
            int c;
            
            
            c = a-b;
            return c;
            
        }
    
    public static void main(String[] args) {
        
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        a = sc.nextInt();
        System.out.println("Enter first no.");
        b = sc.nextInt();

        int ans = sub(a,b);
    
        System.out.println("Subtraction= "+ans);
        
    }
    
}
