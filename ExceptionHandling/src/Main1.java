public class Main1 {
    static void show(){
        int a=10;
        int b=0;
        try {
            try {
                System.out.println(a/b);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Inner Catch");
            }
        }catch (ArithmeticException e){
            System.out.println("Exception handled in outer catch");
        }
    }

    public static void main(String[] args) {
        show();
    }
}
