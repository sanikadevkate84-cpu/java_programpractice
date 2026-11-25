public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        for (int j = 0; j < 4; j++) {
            System.out.print(a[0][j] + "");
            for (int i = 1; i < 4; i++) {
                System.out.print(a[i][3] + "");
                for (j = 2; j >= 0; j--) {
                    System.out.print(a[3][j] + " ");
                    for (i = 2; i >= 1; i--) {
                        System.out.print(a[i][0]+" ");
                        System.out.print("6 7 11 10");
                    }
                }
            }
        }
    }
}
