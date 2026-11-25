import java.util.Scanner;

public class Countnumberwhile {
public     static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number");
//       int num = in.nextInt();
    int num =1234;
       int count=0;
       while (num!=0) {
           count++;
           num = num / 10;
       }
            System.out.println(count);



    }
}
