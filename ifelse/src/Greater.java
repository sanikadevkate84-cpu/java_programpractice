import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        int number ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        number = in.nextInt();

        if(number>10) {
            System.out.println("greater than by 10");
        }
        else{
            System.out.println("not greater than by 10");
        }

    }
}
