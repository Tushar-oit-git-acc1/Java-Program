public abstract class Staff {
    protected int id;
    protected String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void display();
}

public class OfficeStaff extends Staff {
    private String department;

    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        OfficeStaff officeStaff = new OfficeStaff(1, "John Doe", "HR");
        officeStaff.display();
    }
}