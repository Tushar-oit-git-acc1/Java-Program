import java.util.*;
public class Five 
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four nos. to subtract");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.print("Subtraction of "+a+" +"+b+" +"+c+" +"+d+" = "+(a-b-c-d));
        sc.close();


        
    }
    
}
