import java.util.Scanner;

public class Electricitybill {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("enter units");
       int units  = in.nextInt();
       int bill=0;
       switch (units/100) {
           case 1:
               System.out.println(bill=units*7);
               break;
           case 2:
               System.out.println(bill=units*5);
               break;
           default:
               System.out.println(bill=units*10);
       }




       }

   }

