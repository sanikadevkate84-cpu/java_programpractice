public class Fibonacciseries {
    static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        int i =1;
        for(i=1;i<=10;i++){
            c=a+b;
            a=b;
           b = c;
//            i++;
            System.out.println(a);



        }


    }
}
