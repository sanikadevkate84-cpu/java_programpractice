import Abstaction.Payment;

public class BankAccount {
    String acoountNumber;
    String holderName;
    int Balance;
    public void Deposite(int amount) {
        System.out.println("deposite"+amount);
    }
    public void withdrawal(int amount){
        System.out.println("withdrawal"+amount);
    }
    public void holdername(String holderName) {
        System.out.println("Sanika");
    }
    public void Balance (int balance){
        System.out.println(5000);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.Deposite( 1000);
        b.withdrawal( 5000);
        b.holdername("Sanika");
        b.Balance(5000);

        ;
    }

}

