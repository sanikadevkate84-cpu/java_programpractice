public class ArithameticException {
   public static void main(String[] args) {
       try{
           int a= 10;
           System.out.println(a/0);
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }

    }
}
