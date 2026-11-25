import java.util.Scanner;

public class Weeks {
  public   static void main(String[] args) {
      int w ;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter weeks");
      w = in.nextInt();
      switch (w){
          case 1:
              System.out.println("monday");
              break;
          case 2:
              System.out.println("tuesday");
              break;
          case 3:
              System.out.println("wednesday");
              break;
          case 4:
              System.out.println("tursday");
              break;
          case 5:
              System.out.println("friday");
              break;
          case 6 :
              System.out.println("satraday");
              break;
          case 7 :
              System.out.println("sunday");
              break;
          default:
              System.out.println("Not a week");
              break;

      }

    }
}
