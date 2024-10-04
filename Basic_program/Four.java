import java.util.*;
public class Four 
{
    public static void main(String[] args)
    {
        int a,b,c,d,e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 nos. to add ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        System.out.println("Addition of "+a+"+"+b+"+"+c+"+"+d+"+"+e+" = "+(a+b+c+d+e));
        sc.close();

    }
    
}
