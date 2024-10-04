//Sum of nos. between x & y

import java.util.Scanner;

public class Two{
    public static void main(String[] args) {

        int x,y,i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        x = sc.nextInt();
        System.out.println("Enter the last no.");
        y = sc.nextInt();
        sc.close();

        if (x<y)
        {
            for(i=x;i<=y;i++)
            {
                sum+=i;
            }
        }else
        {
            for(i=y;i<=x;i++)
            {
                sum+=i;
            }        
        }

        System.out.println("Sum of nos between "+x+" & "+y+" is "+sum);


    }
}
    

