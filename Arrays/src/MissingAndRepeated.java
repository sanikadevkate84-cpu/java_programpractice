public class MissingAndRepeated {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 4, 6};
        int n = 6;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[j]==i){
                    count++;

                }
            }
           if(count==0){
                System.out.println("Missing ="+i);
            }
            if(count==2){
                System.out.println("Repeated ="+i);
            }
        }
    }
}