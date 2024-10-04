

class shape {
    public virtual void draw(){
        System.out.println("drwaing....");
    }
}

class rectangle extends shape{
    public void draw(){
        System.out.println("drewing the rectangle");
    }
}

class circle extends shape{
    public  void draw(){
        System.out.println("drwing the circle");
    }
}

public class draw_poly {
    shape  s;
    s= new shape;
    s.draw();
    s= new rectangle;
    s.draw();
    s= new circle;
    s.draw();
}
