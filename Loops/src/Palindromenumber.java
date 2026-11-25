public class Palindromenumber {
    static void main(String[] args) {
        int num=1231;
        int rev= 0;
        for(;num>0;num=num/10) {
            rev = rev * 10 + num % 10;
        }
            System.out.print(rev);


    }
}
