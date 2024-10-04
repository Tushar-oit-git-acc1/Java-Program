//Print no. series sequentially from 1 to 'n' but only 5 nos.  on each line.

import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. for range");
        n = sc.nextInt();

        for(i=1;i<=n;i++)
        {
            System.out.print(i+"\t");
            if(i%5 ==0)
            {
                System.out.println();
            }
        }

    }
    
}
