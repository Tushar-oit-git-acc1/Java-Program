// Homework in herichical inhertance
import java.util.Scanner;

class banckacc{
int accNo;
String name;
int balence;
String IFSC_code;
String Branch;
String Address;
public banckacc(int accNo, String name, int balence, String IFSC_code,String Branch, String Address) {
    this.accNo = accNo;
    this.name = name;
    this.balence = balence;
    this.IFSC_code = IFSC_code;
    this.Branch = Branch;
    this.Address = Address;

}
void display()
{
    System.out.println("Account Number : "+this.accNo);
    System.out.println("Account Holder Name : "+this.name);
    System.out.println("Account Balence : "+this.balence);
    System.out.println("IFSC Code : "+this.IFSC_code);
    System.out.println("Branch : "+this.Branch);
    System.out.println("Address : "+this.Address);

}
}
class saving extends banckacc{
    int intrest;
    
    saving(int accNo, String name, int balence, String IFSC_code,String Branch, String Address,int intrest) 
    {
        super(accNo, name, balence, IFSC_code, Branch, Address);
        this.intrest = intrest;

    }
    void display1(){
        super.display();
        System.out.println("Intrest : "+this.intrest);

    }
}

class current extends banckacc{
    int overdraft;
    current(int accNo, String name, int balence, String IFSC_code,String Branch,String Address,int overdraft)
    {
        super(accNo, name, balence, IFSC_code, Branch, Address);
        this.overdraft = overdraft;

    }
    void display2(){
        super.display();
        System.out.println("Overdraft : "+this.overdraft);

    }

}

public class bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number : ");
        int accNo = sc.nextInt();
        System.out.println("Enter Account Holder Name : ");
        String name = sc.next();
        System.out.println("Enter Account Balence : ");
        int balence = sc.nextInt();
        System.out.println("Enter IFSC Code : ");
        String IFSC_code = sc.next();
        System.out.println("Enter Branch Name : ");
        String Branch = sc.next();
        System.out.println("Enter Address : ");
        String Address = sc.next();
        System.out.println("Enter Intrest : ");
        int intrest = sc.nextInt();
        System.out.println("Enter Overdraft : ");
        int overdraft = sc.nextInt();
        saving s = new saving(accNo, name, balence, IFSC_code, Branch,Address, intrest);
        s.display1();
        current c = new current(accNo, name, balence, IFSC_code, Branch, Address, overdraft);
        c.display2();
        
    }
}