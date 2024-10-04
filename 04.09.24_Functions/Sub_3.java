//No Parameter With Return

import java.util.Scanner;

public class Sub_3 {
    static void sub(int a,int b)
        {
            int c;
            
            
            c = a-b;
            System.out.println("Subtraction = "+c);
            
        }
    
    public static void main(String[] args) {
        
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        a = sc.nextInt();
        System.out.println("Enter first no.");
        b = sc.nextInt();

        sub(a,b);
        
        
    }
    
}
