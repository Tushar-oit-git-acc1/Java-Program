/*!Fix the bug for even no. i/p
 * * * *
 *     *
 *     *
 * * * * 
 */

 import java.util.*;
public class Five 
{
    public static void main(String[] args) 
    {
     int i,j,n;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the no.");
     n = sc.nextInt();

     for(i=1;i<=n;i++)
     {
        if(i==1 || i==n)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }else
        {
            for(j=1;j<=n+3;j++)
            {
                if(j==1 || j==n+3)
                {
                    System.out.print("* ");
                }else
                {
                    System.out.print(" ");
                }
            

            }
            System.out.println();
        } 
        
     }

    }
    
}
