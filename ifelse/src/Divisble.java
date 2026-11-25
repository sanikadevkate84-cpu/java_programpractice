import java.util.Scanner;

public class Divisble {
    public static void main(String[] args) {
        int num =10;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number");
//        num= in.nextInt();

        if(num%5==0&&num%11==0) {
            System.out.println("divible by 5 and 11");
        }
        else{
            System.out.println("not divible by 5 and 11");
        }
    }
}
