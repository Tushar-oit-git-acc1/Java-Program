import java.util.*;
abstract class area
{
abstract void cal_area();
abstract void cal_vol();
}
class circle1 extends area
{
double r,A,V; 

circle1(double r) 
{
this.r=r;
}
public void cal_area()
{
A=3.14*r*r;
System.out.println("Arae="+A);
}
public void cal_vol()
{
V=(4/3)*3.14*r*r*r;
System.out.println("volume="+V);
}
}
class cone extends area
{
double r,h,A,V; 

cone(double r,double h) 
{
this.r=r;this.h=h;
}
public void cal_area()
{
A=(1/3)*3.14*r*r*h;
System.out.println("Arae="+A);
}
public void cal_vol()
{
V=(1/3)*3.14*r*r*h;
System.out.println("volume="+V);
}
}
class cylinder extends area{
double r,h,A,V;
cylinder(double r,double h)
{
this.r=r;this.h=h;
}
public void cal_area()
{
A=2*3.14*r*h+2*3.14*r*r;
System.out.println("area="+A);
}
public void cal_vol()
{
V=3.14*r*r*h;
System.out.println("volume="+V);

}
class sphere extends area{
double r,A,V;
sphere(double r)
{
this.r=r;
}
public void cal_area()
{
A=4*3.14*r*r;
System.out.println("area="+A);
}
public void cal_vol()
{
V=(4/3)*3.14*r*r*r;
System.out.println("volume="+V);
}
}
class box extends area{
double l,lw,wh,w,h,A,lh,V;
box(double r)
{
this.l=l;
this.w=w;
this.h=h;
}
public void cal_area()
{
A=2*(lw+wh+lh);
System.out.println("area="+A);
}
public void cal_vol()
{
V=l*w*h;
System.out.println("volume="+V);
}
}
}


public class Account_poly{
public static void main(String[] args) 
{
    Double r,h;
    //area a1=new area();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter r");
    r=sc.nextDouble();
    circle1 c1=new circle1(r);
    c1.cal_area();
    c1.cal_vol();
    System.out.println("enter h");
    h=sc.nextDouble();
    cone c11=new cone(r,h);
    c11.cal_area();
    c11.cal_vol();
    



}

}
