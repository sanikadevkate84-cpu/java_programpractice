package Encapsulation;

public class BankAccount {
    private int balance;
public void deposit(int amount){
balance +=amount;
}
public void withdraw(int amount){
    balance-=amount;

}
int getBalance(){
    return balance;

}

    public static void main(String[] args) {
    BankAccount b= new BankAccount();
    b.deposit(5000);
    b.withdraw(15000);
    System.out.println(b.getBalance());

    }
}
