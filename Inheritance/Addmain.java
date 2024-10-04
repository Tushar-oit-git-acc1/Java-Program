import java.util.Scanner;

class Addmain {
    int a, b, c;

    void cal_add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("Addition of a & b is " + c);
    }

    void cal_add(int a, int b) {
        c = a + b;
        System.out.println("Addition of a & b is " + c);
    }

    void cal_add(int a, int b, int d) {
        c = a + b + d;
        System.out.println("Addition of a, b & d is " + c);
    }
}
    public class Addmain{

    public static void main(String[] args) {
        Addmain ad = new Addmain();
        ad.cal_add();
        ad.cal_add(10, 20);
        ad.cal_add(10, 20, 30);
    }
}
