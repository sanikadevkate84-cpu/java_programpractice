package Polymorphism;

public class Calculator1 {
    int add ;
    public void add(int a , int b){
        System.out.println(a+b);
    }
    public void  add(int a, int b ,int c){
        System.out.println(a + b+c);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }

     public static void main(String[] args) {
       Calculator1 c1 = new Calculator1();
       c1.add(20,10);
       c1.add(20,10,5);
       c1.add(20.5,10.5);
    }
}

