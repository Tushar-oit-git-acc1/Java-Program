import java.util.Scanner;

abstract class Innerorder_poly {
    abstract void show();
}

class sale_order extends Innerorder_poly {
    int id;
    String name;
    int amount;

    sale_order(int id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    @Override
    void show() {
        System.out.println("Sale Order Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Amount: " + amount);
    }
}

class purchase_order {
    int id;
    String name;
    int amount;
    String vendor;
    String customer;

    purchase_order(int id, String name, int amount, String vendor, String customer) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.vendor = vendor;
        this.customer = customer;
    }

    void show1() {
        System.out.println("Purchase Order Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Amount: " + amount);
        System.out.println("Vendor: " + vendor);
        System.out.println("Customer: " + customer);
    }
}

public class order_poly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the staff ID: ");
        int staffId = sc.nextInt();

        System.out.print("Enter the staff name: ");
        String staffName = sc.next();

        System.out.print("Enter the staff amount: ");
        int staffAmount = sc.nextInt();

        System.out.print("Enter the vendor: ");
        String staffVendor = sc.next();

        System.out.print("Enter the customer: ");
        String staffCustomer = sc.next();

        sale_order so = new sale_order(staffId, staffName, staffAmount);
        so.show();

        purchase_order po = new purchase_order(staffId, staffName, staffAmount, staffVendor, staffCustomer);
        po.show1();
    }
}
