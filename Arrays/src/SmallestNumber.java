public class SmallestNumber {
    public static void main(String[] args) {
       int[]a={5,20,30,40,50};
       int min=a[0];
       for(int i=0;i<a.length;i++){
           if(a[i]<min){
               min=a[i];
           }
           System.out.print("Smallest :"+min);
       }
    }
}
