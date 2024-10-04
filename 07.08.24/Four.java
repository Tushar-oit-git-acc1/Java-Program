//!Print prime nos. in given range.

import java.util.Scanner;

public class Four{
    public static void main(String[] args) {
        {
            int n,i,j,range,flag=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a no");
            n = sc.nextInt();
            System.out.println("Enter the range");
            range = sc.nextInt();

            for(i=n;i<=range;i++)
                for(j=2;j<= (i/2);j++)
                {
                    if(i%j != 0)
                    {
                        flag=1;
                    }else{
                        flag=0;
                    }
                }
                if(flag==0)
                {
                    System.out.println(i);
                }
                
            
        }
    }
    
}
