import java.util.Scanner;

public class NumberFormate {
    public static void main(String[] args) {
       int a = 1234;

//       Scanner sc= new Scanner(System.in);
        try {
//            String s= sc.nextLine();
            int n = Integer.parseInt(String.valueOf(a));
            System.out.println(n);

        }catch (NumberFormatException e){
            System.out.println("invalid number ");
        }
    }
}
