public class Product {
    static void main(String[] args) {
        int num = 1234;
        int p= 1;
        for(;num>0;num=num/10){
            p=p*(num%10);

        }
        System.out.print(p);


    }
}
