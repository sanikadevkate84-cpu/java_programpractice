import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        int age ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        age = in.nextInt();
        if(age>18) {
            System.out.println("you can vote ");

        }
        else{
            System.out.println("you can't vote ");





        }
    }
}