public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] a = {10, 25, 5, 40, 30};
        int max = 0;
        int second = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                second = max;
                max = a[i];
            } else if (a[i] > second) {
                second =a[i];


            }
            System.out.print("Second largest number :"+a[i]);
        }
    }
}
