package Abstaction;

public class Creditcard implements Payment{
    @Override
    public void pay() {
        System.out.println(" Creditcard = Payment through Creditcard");
    }
}
