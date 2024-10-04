import java.util.Scanner;

class emp {
    int id;
    String name;
    int DOB;
    public emp(int id, String name, int DOB) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
    }
    public void  dispaly(){
        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("dob : "+DOB);
    }
}
class emps extends emp{
    String dname;
    int DOJ;

    emps(int id, String name, int DOB, String dname, int DOJ)
    {
        super(id, name, DOB);
        this.DOJ=DOJ;
        this.dname=dname;
    }
    void show()
    {
        System.out.println("Depart name : "+dname);
        System.out.println("Date of Joining : "+DOJ);
    }

public class empo {
    public static void main(String[] args) {
        int id,DOJ,DOB;
        String name,dname;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the id, nanme and DOJ");
        id=sc.nextInt();
        name=sc.next();
        DOJ=sc.nextInt();
        System.out.println("Enter the DOB and dname");
        DOB=sc.nextInt();
        dname=sc.next();

        emps e1 = new emps(id, name, DOB, dname, DOJ);
        e1.show();
        e1.dispaly();

    }
}
}
