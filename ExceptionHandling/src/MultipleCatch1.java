public class MultipleCatch1 {
   public static void main(String[] args) {
        try {
            int a= 15/0;
            int b[]= {15,20,30,40};
            System.out.println(b[6]);
            int n= Integer.parseInt("ABCD");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic error");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index error");
        }catch (NumberFormatException e){
            System.out.println("Number format error");
        }
    }
}
