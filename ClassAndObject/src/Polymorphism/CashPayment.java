package Polymorphism;

public class CashPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("Paid by CashPayment");
    }
}
