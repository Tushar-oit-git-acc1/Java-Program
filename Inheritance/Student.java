import java.util.Scanner;

class StudDemo {
    int rno;
    String sname;
    double per;

    Scanner sc = new Scanner(System.in);

    void Student() {
        System.out.println("Enter rollno, name, and percentage:");
        rno = sc.nextInt();
        sname = sc.nextLine();
        per = sc.nextDouble();
    }

    void display() {
        System.out.println("Rollno: " + rno);
        System.out.println("Name: " + sname);
        System.out.println("Percentage: " + per);
    }
}

public class Student {
    public static void main(String[] args) {
        StudDemo s1 = new StudDemo();
        s1.display();

        StudDemo s2 = new StudDemo();
        s2.display();

        StudDemo s3 = new StudDemo();
        s3.display();
    }
}

