public class LargestSumRowandColumn {
   public static void main(String[] args) {
       int a[][]={{10,20,30},
                   {40,50,60},
                   {5,15,25} };
         int maxRow=0;
         int maxCol=0;
         int rowNo=0;
         int colNo=0;
         for(int i=0;i<3;i++){
             int sum=0;
             for(int j=0;j<3;j++){
                 sum+=a[i][j];
                 if(sum>maxRow){
                     maxRow=sum;
                     rowNo=i+1;

                 }
             }
             for(int j=0;j<3;j++){
                 sum=0;
                 for( i =0;i<3;i++){
                     sum+=a[i][j];
                     if(sum>maxCol){
                         maxCol=sum;
                          colNo=j+1;

                     }
                 }
                 System.out.println("Max row =row"+rowNo);
                 System.out.println("Row sum ="+maxRow);
                 System.out.println("Max column = column"+colNo);
                 System.out.println(" column sum ="+maxCol);
             }
         }

    }
}
