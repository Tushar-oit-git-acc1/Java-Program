import java.util.Scanner;

class employee {
    int eid;
    String name;
    int age;
    
    employee(){
        this.eid=eid;
        this.name=name;
        this.age=age;

    }
    void show(){
        System.out.println("Employee id is "+eid);
        System.out.println("Employee name is "+name);
        System.out.println("Employee age is "+age);
    }
}
public class employe{
    public static void main(String[] args) {
        int eid;
        String name;
        int age;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter employee id:");
        eid=sc.nextInt();
        System.out.println("Enter employee name:");
        name=sc.next();
        System.out.println("Enter employee age:");
        age=sc.nextInt();
        employee e=new employee();
        e.show();

}
}