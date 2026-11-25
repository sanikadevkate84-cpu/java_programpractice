package CombinedOOP;

public class CurrentAccount extends Account{
    @Override
    public void display() {
        System.out.println("CurrentAccount"+getBalance());
    }
}
