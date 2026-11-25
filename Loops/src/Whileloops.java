import java.util.Scanner;

public class Whileloops {
    static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int rev = 0;
        while (num!=0){
            int last=num%10;
            rev=rev*10+last;
            num=num/10;
            System.out.println(rev);
        }

    }
}
