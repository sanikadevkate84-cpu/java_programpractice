package Polymorphism;

public class Main1 {
    public static void main(String[] args) {
        Animal a= new Animal();
        a.Sound();
        Cat A1= new Cat();
        A1.displayCat();
        Animal a2= new Dog();
        a2.Sound();
        Animal a3= new Cow();
        a3.Sound();


    }
}
