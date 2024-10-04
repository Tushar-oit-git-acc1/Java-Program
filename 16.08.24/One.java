//Pronic no. upto n

import java.util.*;
public class One
{
    public static void main(String[] args) {
        int i,j,n,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = sc.nextInt();
        sc.close();

        for(i=1;i<=n;i++)
        {
            num = i;
            for(j=1;j <= num/2;j++)
            {
                if(num == (j * (j+1)))
                {
                    System.out.print(num+" ");
                    break;
                }
            }
        }
    }
}