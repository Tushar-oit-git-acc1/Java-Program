class animal {
    
    void eat(){
        System.out.println("Eating....");
    }
}

class dog extends animal{
    void eat() {
        System.out.println("Dog is eating...");
    }
}
public class animal_poly{
    public static void main(String[] args) {
        animal an = new animal();
        an.eat();

    }
}