import java.lang.classfile.attribute.LineNumberTableAttribute;

public class Calculation {
    public void add(int a,int b) {

        System.out.println(a + b);
    }
        public void sub(int a,int b) {

        System.out.println(a - b);
        }
        public void mul(int a,int b) {

        System.out.println(a * b);
        }
        public void mod(int a,int b){

        System.out.println(a%b);
        }
        public void div(int a,int b){

        System.out.println(a/b);
        }
           public static void main(String[] args) {
        Calculation d=new Calculation();
        d.add( 12,10);
        d.sub(12,5);
        d.mul(12,7);
        d.mod(20,10);
        d.div(7,2);
        d.add(5,17);
        d.add(40,50);


    }
    }

