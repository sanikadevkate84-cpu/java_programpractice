import java.util.Scanner;

public class Atmprogram {
    public static void main(String[] args) {;
        int balance;
        Scanner in = new Scanner(System.in);
        System.out.println("check balance");
        balance = in.nextInt();

        switch(balance){
    case 1:
        System.out.println("check balance");
        break;
    case 2:
        System.out.println("Deposite money");
        break;
    case 3:
        System.out.println("withdrwell money");
        break;
    default:
        System.out.println("invalid ");

}
    }


}
