package CombinedOOP;

public class SavingAccount extends Account{
    @Override
    public void display() {
        System.out.println("SavingAccount"+getBalance());
    }
}
