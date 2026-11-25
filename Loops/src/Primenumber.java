public class Primenumber {
    static void main(String[] args) {
        int n = 2;
        int count = 0;
        for (n = 2; n <= 100; n++) {
            count = 0;
            for (int i = 1; i <= n; i++) {
                count = count + (n % i == 0 ? 1 : 0);

            }
                System.out.println(count == 2 ? n : " ");


        }
    }
}