public class RowAndColum {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println("row :");
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += a[i][j];
            }
                System.out.println(sum );
            }
            System.out.println("colume :");

            for (int i = 0; i < 3; i++) {
               int sum = 0;
                for (int j = 0; j < 3; j++) {
                    sum += a[i][j];
                }
                    System.out.println(sum );




            }
        }
    }
