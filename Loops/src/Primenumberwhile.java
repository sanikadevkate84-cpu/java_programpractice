public class Primenumberwhile {
    static void main(String[] args) {
        int n = 20;
        int i = 2;
        while (i <= n) {
            int j = 2;
            while (j < i && i % j != 0) {
                j++;
            }
            if (i == j) {


                System.out.println(i);
            }
            i++;

        }
    }
}