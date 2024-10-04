//Palindrom no. program

import java.util.Scanner;

public class Palindrom
{
    
    //1. No Parameter No return
    static void Palindrom1()
    {
        Scanner sc = new Scanner(System.in);
        int n,n1,num=0,org_no;
        System.out.println("Enter a no.");
        n = sc.nextInt();
        
        org_no=n;

        while(n!=0)
        {
            n1 = n%10;
            num = (num * 10) + n1;
            n = n/10;
            

        }
        

        if(org_no == num)
        {
            System.out.println(org_no+" is a palindrom no.");
        }else
        {
            
            System.out.println(org_no+" is not a palindrom no.");
        }

    }

    //2. With Parameter No return
    static void Palindrom2(int n)
    {
        
        int n1,num=0,org_no;
        
        
        org_no=n;

        while(n!=0)
        {
            n1 = n%10;
            num = (num * 10) + n1;
            n = n/10;
        }
        if(org_no == num)
        {
            System.out.println(org_no+" is a palindrom no.");
        }else
        {    
            System.out.println(org_no+" is not a palindrom no.");
        }

    }

    //3. No Parameter With return
    static String Palindrom3()
    {
        Scanner sc = new Scanner(System.in);
        int n,n1,num=0,org_no;
        String str;
        System.out.println("Enter a no.");
        n = sc.nextInt();
        
        org_no=n;

        while(n!=0)
        {
            n1 = n%10;
            num = (num * 10) + n1;
            n = n/10;
        }
        if(org_no == num)
        {
            str = " is a palindrom no.";
        }else
        {    
            str = " is not a palindrom no.";
        }

        return str;

    }

    //4. With Parameter With return
    static String Palindrom4(int no)
    {
        
        int n1,num=0,org_no;
        String str;
        System.out.println("Enter a no.");
        
        org_no=no;

        while(no!=0)
        {
            n1 = no%10;
            num = (num * 10) + n1;
            no = no/10;
        }
        if(org_no == num)
        {
            str = " is a palindrom no.";
        }else
        {    
            str = " is not a palindrom no.";
        }

        return str;

    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //Type 1
        Palindrom1();

        //Type 2
        int n1;
        
        System.out.println("Enter a no.");
        n1 = sc.nextInt();
       
        Palindrom2(n1);

        //Type 3
        String ans;
        ans = Palindrom3();
        System.out.println(ans);

        //Type 4
        int no;
        
        System.out.println("Enter a no.");
        no = sc.nextInt();
        String res = Palindrom4(no);
        System.out.println(res);

        sc.close();

    }
}
