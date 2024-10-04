import java.util.Scanner;

class area1 {
    double r,a;
    area1(double r)
    {
        this.r=r;
    }

    void cal_area()
    {
        a=3.14*r*r;
        System.out.println("radius=" +r+"\n area"+a);
    }
}

    class volume11 extends area1{
        double h,v;
        volume11(double r,double h)
        {
            super(r);
            this.h=h;
        }
        void cal_volume()
        {
            super.cal_area();
            v=a*h;
            System.out.println("Height="+h+"\n volume="+v);

        }
    }
    public class area {
        public static void main(String[] args) {
            double r, h;
            Scanner sc= new Scanner(System.in);
            System.out.println("enter r&h");
            r=sc.nextDouble();
            h=sc.nextDouble();
            volume11 v1=new volume11(r,h);
            v1.cal_volume();

        }
    }
