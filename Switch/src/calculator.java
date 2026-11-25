import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int number = 3 ;
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter number");
//        number = in.nextInt();
        switch (number){
            case 1 :
                System.out.println("a+b");
                break;
            case 2:
                System.out.println("a-b");
            break;
            case 3:
                System.out.println("a*b");
                break;
            case 4 :
                System.out.println("a/b");
                break;
            default:
                System.out.println("not a number");




                }

    }
}
