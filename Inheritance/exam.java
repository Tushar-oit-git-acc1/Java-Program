class shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

}
class equaltringle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    
}

public class exam {
    public static void main(String[] args) {
        shape s1 =  new shape();
        s1.area();

        s1.Triangle();
    }
}
