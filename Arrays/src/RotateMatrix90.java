public class RotateMatrix90 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        for(int j=0;j<3;j++){
            for(int i=2;i>=0;i--){
                System.out.print(a[i][j]+"");
                System.out.println();
            }
        }
    }
}
