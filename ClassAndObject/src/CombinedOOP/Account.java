package CombinedOOP;

public class Account {
    private int Balance;
    public void setBalance(int Amount ) {
        Balance = Amount;
    }
    int getBalance() {
        return Balance;
    }
    public void display(){
        System.out.println("Account Balance"+getBalance());

    }
}
