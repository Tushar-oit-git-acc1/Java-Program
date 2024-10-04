//No parameter No Return

import java.util.Scanner;

public class Sub_1 {

    static void sub()
        {
            int a,b,c;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first no.");
            a = sc.nextInt();
            System.out.println("Enter first no.");
            b = sc.nextInt();

            c = a-b;
            System.out.println("Subtraction = "+c);

            
        }
    
    public static void main(String[] args) {
        
        sub();
        
        
    }
    
}
