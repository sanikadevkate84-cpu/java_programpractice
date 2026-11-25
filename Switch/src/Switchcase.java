import java.util.Scanner;

public class Switchcase{

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        num = in.nextInt();
        switch (num){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("enter wrong numder");
                break;
        }

    }
}


