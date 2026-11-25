import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int age ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        age = in.nextInt();

        if(age >= 18){
            System.out.println("you can vate ");
        }
        else{
            System.out.println("you cant vate");
        }
    }
}
