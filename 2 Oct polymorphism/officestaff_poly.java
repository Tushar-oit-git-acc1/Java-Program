// public abstract class officeStaff_poly {
//     protected int id;
//     protected String name;
//     public officeStaff_poly(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     // Abstract method
//     public abstract void display();
// }

// public class OfficeStaff extends officeStaff_poly {
//     private String department;

//     public OfficeStaff(int id, String name, String department) {
//         super(id, name);
//         this.department = department;
//     }

//     // Overriding display method
//     @Override
//     public void display() {
//         System.out.println("ID: " + id);
//         System.out.println("Name: " + name);
//         System.out.println("Department: " + department);
//     }

//     public static void main(String[] args) {
//         OfficeStaff officeStaff = new OfficeStaff(1, "John Doe", "HR");
//         officeStaff.display();
//     }
// }
public abstract class officeStaff_poly {
    protected int id;
    protected String name;

    public officeStaff_poly(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Abstract method
    public abstract void display();
}

public class OfficeStaff extends officeStaff_poly {
    private String department;

    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    // Overriding display method
    @Override
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        OfficeStaff officeStaff = new OfficeStaff(1, "John Doe", "HR");
        officeStaff.display();
    }
}
