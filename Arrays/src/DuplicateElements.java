public class DuplicateElements {
  public  static void main(String[] args) {
        int a[]= {10,20,10,30,20,40};
        for(int i=0;i<a.length;i++){
            int j;
            for(j=0;j<i;j++){
                if(a[i]==a[j]){
                    break;


                    }

                }
            if (i == j) {
                System.out.println(a[i]+" ");

            }
                       }
    }
}
