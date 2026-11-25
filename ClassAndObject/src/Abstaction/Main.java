package Abstaction;

public class Main {
    public static void main(String[] args) {
//       Scal s= new Cal() ;
//        s.muli(10,5);
//        s.div(10,5);
        Payment p= new UPI();
        Payment p1 = new Creditcard();
        p.pay();
        p1.pay();


        }


            }




