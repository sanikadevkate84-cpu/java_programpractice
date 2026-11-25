package Polymorphism;

public class DemoPly  {
    public static void main(String[] args) {


        Calculator ca = new Calculator();
        ca.add(12,15);
        ca.add(12,15,10);
        Scicalculator sc= new Scicalculator();
        sc.add(12,5);

    }
}
