import java.util.*;
public class Two 

{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two nos.");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Addition of "+a+"&"+b+" is"+(a+b)); 
        sc.close();
    }
}
