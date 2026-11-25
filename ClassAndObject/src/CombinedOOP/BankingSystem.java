package CombinedOOP;

public class BankingSystem {
    public static void main(String[] args) {
    SavingAccount s = new SavingAccount();
    s.setBalance(10000);
    CurrentAccount c = new CurrentAccount();
    c.setBalance(40000);
    s.display();
    c.display();
    }
}
