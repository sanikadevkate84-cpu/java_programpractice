package Abstaction;

public class Cal implements Scal {
//    public void add(int a , int b){
//        System.out.println(a+b);
//    }
//
//    @Override
//    public void sub(int c , int d) {
//        System.out.println(c+d);
//    }


    @Override
    public void muli(int num1, int num2) {
        System.out.println(num1*num2);
    }

    @Override
    public void div(int num3, int num4) {
        System.out.println(num3/num4);

    }
}
