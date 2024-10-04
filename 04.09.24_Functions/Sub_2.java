//No parameter With Return

import java.util.Scanner;

public class Sub_2 {
    static int sub()
        {
            int a,b,c;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first no.");
            a = sc.nextInt();
            System.out.println("Enter first no.");
            b = sc.nextInt();
            c = a-b;
            return c;
            
        }
    
    public static void main(String[] args) {
        
        int ans = sub();
        System.out.println("Subtraction= "+ans);
        
        
    }
    
}
