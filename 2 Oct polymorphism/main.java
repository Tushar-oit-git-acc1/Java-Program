import java.util.Scanner;

public class AreaDemo {
    double r,A;
    void accept (double r)
    {
        this.r=r;

    }
    double cal_area(){
        A=3.14*r*r;
        return(A);
    }
}
public class main
{
    public static void main(String[] args) {
        Double r,A;
        Scanner sc= new Scanner(System.in);
        AreaDemo a1 = new AreaDemo();
        System.out.println("Enter the radius of circle:");
        r=sc.nextDouble();
        a1.accept(r);
        A=a1.cal_area();
        System.out.println("Area of circle is :"+A);
        
    }
}
