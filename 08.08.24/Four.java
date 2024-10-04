//Accpet user name & print it n times.

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        String name;
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter the frequency");
        n = sc.nextInt();

        if(n<=0)
        {
            System.out.println("Inavlid frequency");
        }else
        {
            for(i=1;i<=n;i++)
            {
            System.out.println(name);
            }
        }
        


    
    }
    
}
