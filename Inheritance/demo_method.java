import java.util.Scanner;

class employee {
    
    int eid;
    String name;
    double salary;
    employee(){
        eid=101;
        name="Rahul";
        salary=50000;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter id , name and salary");
        eid=sc.nextInt();
        name=sc.next();
        salary=sc.nextDouble();

    }
    void Display() //display the value
    {
        System.out.println("Employee id is "+eid);
        System.out.println("Employee name is "+name);
        System.out.println("Employee salary is "+salary);
    }
}
    public class demo_method{
        public  static void main (String [] args){
            employee e=new employee();
            e.Display();
            employee e2 = new employee();
            e2.Display();
        }
        
    }

