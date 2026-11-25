public class Multiplecatch {
    public static void main(String[] args) {
        try {
            int a=10/0;
            int b[]={1,2,3};
            System.out.println(b[5]);
           int n= Integer.parseInt("abc");

        }catch (ArithmeticException e){
            System.out.println("Arithmetic error");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index error");
        }catch (NumberFormatException e){
            System.out.println("Number Format error ");
        }

    }
}
