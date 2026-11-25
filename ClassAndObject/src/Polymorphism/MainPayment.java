package Polymorphism;

public class MainPayment {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.pay();
        CreditCardPayment cp= new CreditCardPayment();
        cp.pay();
        UPIPayment u = new UPIPayment();
        u.pay();
         CashPayment c= new CashPayment();
         c.pay();
    }
}
