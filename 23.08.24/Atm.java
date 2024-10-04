//ATM Program

import java.util.Scanner;

public class Atm
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int cpin=1234,bal=40000,choice = 0,count = 0,amt;
        /*System.out.println("Please select the account type.\nPress 1. Saving Account 2. Current Account");
        choice = sc.nextInt();*/

        while(count < 3)
        {
            
            System.out.println("Please enter your Pin");
            int  pin = sc.nextInt();
            count++;


            if(pin == cpin)
            {
                System.out.println("1: Savings Account\n2:Current Account\n3. Exit");
                System.out.println("Enter your account type");
                choice = sc.nextInt();
                

                switch(choice)
                {
                    case 1:
                    
                    System.out.println("Enter your choice\n1. Balance Enquiry\n2. Cash Withdrawl\n3. Cash Deposit\n4. Deposit Amount\n5.Change ATM pin\n6.Exit");
                    choice = sc.nextInt();

                    
                    switch(choice)
                    {
                        case 1:
                        System.out.println("Current Balance is Rs."+bal);
                        break;
                        
                        case 2:
                        System.out.println("Enter withdrawl amount. (Multiples of Rs. 100)");
                        amt = sc.nextInt();

                        if(amt <= bal)
                        {
                            System.out.println("Please collect your cash\nRemaining Balance: Rs. "+(bal-amt));
                        }else
                        {
                            System.out.println("Amount exceeds account balance");
                        }
                        break;

                        case 3:
                        System.out.println("Enter deposit amount. (Multiples of Rs. 50)");
                        amt = sc.nextInt();
                        bal = amt;
                        System.out.println("Deposit Successful.\nCurrent balance is Rs. "+bal);
                        break;

                        case 4:
                        System.out.println("Your interest Amount is Rs. "+(bal*0.04));
                        break;

                        case 5:

                        default:
                        System.out.println("Invalid Choice");
                        break;
                    }
                    break;

                case 2:
                System.out.println("Enter your choice\n1. Balance Enquiry\n2. Cash Withdrawl\n3. Cash Deposit");
                choice = sc.nextInt();

                switch(choice)
                {
                    case 1:
                    System.out.println("Current Balance is Rs."+bal);
                    break;
                    
                    case 2:
                    System.out.println("Enter withdrawl amount. (Multiples of Rs. 100)");
                    amt = sc.nextInt();

                    if(amt <= bal && amt>=20000)
                    {
                        System.out.println("Please collect your cash\nRemaining Balance: Rs. "+(bal-amt));
                        if(bal-amt <20000)
                        {
                            System.out.println("Your balance is below Minimun Account Balance!");
                        }
                    }else
                    {
                        System.out.println("Amount exceeds account balance");
                    }
                    break;




                    
                    case 3:
                    System.out.println("Enter deposit amount. (Multiples of Rs. 50)");
                    amt = sc.nextInt();
                    bal += amt;
                    System.out.println("Deposit Successful.\nCurrent balance is Rs. "+bal);
                    break;                        

                    default:
                    System.out.println("Invalid Choice");
                    break;    
                }



                }


            }else if(count<3)
            {
                System.out.println("Invalid Pin.\nPlease enter your pin again.");
                

                
            }else
            {
                System.out.println("Too many attempts, Your card is blocked.1");
                break;
            }
            
            

        }
        
    }
}



























/* 
cpin,bal,cnt,chice

while(cnt<3)
    do{
        pin  = input
        if(pin=cpin)
        {
            1. savings 2. current
            chice= input

            switch(chice)
            {
                show bal, withdraw,deposit,change pin, interest calc
                if(chice==1)
                switch(chice)
                {
                    case 1 
                    2
                    3
                    4
                    5
                    default 
                }else if(chice==2)
                {
                    switch(chice)
                    {
                        case 1 
                        break;
                        2
                        3
                        4
                        5
                        default
                    }
                }

                
            }
        }
    }
*/