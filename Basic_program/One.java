import java.util.*; // Using '*' we can import all the functions contained in the package
public class One
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nos. ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.print("Addition = "+c);
        sc.close();
    }
}