//* # * # *
//# * # * #
//* # * # * 

import java.util.*;
public class Sixteen 
{
    public static void main(String[] args) 
    {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size: ");
        n = sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i%2 == 0)
                {
                    if(j%2 ==0)
                    {
                        System.out.print("* ");
                    }else
                    {
                        System.out.print("# ");
                    }
                    
                }else 
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    
}
