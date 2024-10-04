import java.util.Scanner;

class Animals{
    String name;
    String weight;
    String color;
    int age;
    public Animals(String name,  String weight, String color, int age){
        this.name=name;
        this.weight=weight;
        this.color=color;
        this.age=age;

    }
    public void dispaly(){
        System.out.println("Name : "+name);
        System.out.println("Weight : "+weight);
        System.out.println("Color : "+color);
        System.out.println("Age : "+age);

    }
}
    public class tiger extends Animals{
        public tiger(String name, String weight, String color, int age)
        {
            super(name, weight, color, age);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the animal:");
            String name = sc.nextLine();
            System.out.println("Enter the weight of the animal:");
            String weight = sc.nextLine();
            System.out.println("Enter the color of the animal:");
            String color = sc.nextLine();
            System.out.println("Enter the age of the animal:");
            int age = sc.nextInt();
            Animals a = new Animals(name, weight, color, age);
            a.dispaly();

        }
    }