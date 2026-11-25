public class Sumdigits {
    static void main(String[] args) {
        int i = 1234;
        int sum = 0;

        for (; i >0; i = i / 10) {

            System.out.println(i%10);

        }
    }
}
