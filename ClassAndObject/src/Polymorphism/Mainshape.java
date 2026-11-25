package Polymorphism;

public class Mainshape {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();
       Circle c = new Circle();
        c.area();
        Rectangle r = new Rectangle();
        r.area();
        Triangle t = new Triangle();
        t.area();
    }
}
