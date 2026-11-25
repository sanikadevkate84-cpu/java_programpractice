package Polymorphism;

public class CreditCardPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("Paid by CreditCard");
    }
}
