//Sum = 1^1 + 2^2 + 3^3...


import java.util.Scanner;

public class Five 
{
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();

        for(i=1;i<=n;i++)
        {
            System.out.print(i+"^"+i);
            if(i<n)
            {
                System.out.print(" + ");
            }
            
        }
    }    
}
